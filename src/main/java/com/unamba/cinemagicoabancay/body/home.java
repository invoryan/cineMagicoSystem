package com.unamba.cinemagicoabancay.body;

import com.unamba.cinemagicoabancay.body.panels.bookingPanelAdd;
import com.unamba.cinemagicoabancay.body.panels.homePanel;
import com.unamba.cinemagicoabancay.body.panels.CloseSessionPanel;
import com.unamba.cinemagicoabancay.body.panels.addFood_DrinkPanel;
import com.unamba.cinemagicoabancay.body.panels.addUserPanel;
import com.unamba.cinemagicoabancay.body.panels.bookingPanelClient;
import com.unamba.cinemagicoabancay.body.panels.editPanel;
import com.unamba.cinemagicoabancay.body.panels.inventoryFood_DrinkPanel;
import com.unamba.cinemagicoabancay.body.panels.promotionPanel;
import com.unamba.cinemagicoabancay.body.panels.reportPanel;
import com.unamba.cinemagicoabancay.circleLabel.CLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class home extends javax.swing.JFrame {
    int xMouse,yMouse,menuHomeClicked=0,menuBookingClicked=0,userClicked=0,editClicked=0,closedClicked=0,BookingPart1Clicked=0,BookingPart2Clicked=0,reportClicked=0,promotionClicked=0,Food_DrinkClicked=0,addFood_DrinkClicked=0,inventoryClicked=0,addUserClicked=0;
    public home() {
        initComponents();
        this.setMinimumSize(new Dimension(1200, 700));
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        icon();
        companyLogo();
        dateToday dt=new dateToday(jLabelDate);
        dt.start();
        user();
        contentStart();
        jPanelBookingPart1.setVisible(false);
        jPanelBookingPart2.setVisible(false);
        jPanelFood_Drink1.setVisible(false);
        jPanelFood_Drink2.setVisible(false);
    }
    private void icon(){
        String icoPath="D:\\Java\\projectos\\cineMagicoAbancay\\src\\main\\java\\com\\unamba\\cinemagicoabancay\\body\\img\\Logo.png";
        Image ico=Toolkit.getDefaultToolkit().getImage(icoPath);
        this.setIconImage(ico);
    }
    private void companyLogo(){
        ImageIcon imgIcon = new ImageIcon("D:\\Java\\projectos\\cineMagicoAbancay\\src\\main\\java\\com\\unamba\\cinemagicoabancay\\body\\img\\LogoCineMagico.png");
        Image imgEscalada = imgIcon.getImage().getScaledInstance(jLabelLogo.getWidth(),jLabelLogo.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        jLabelLogo.setIcon(iconoEscalado); 
    }
    private void user(){
        String userPath="D:\\Java\\projectos\\cineMagicoAbancay\\src\\main\\java\\com\\unamba\\cinemagicoabancay\\body\\img\\usuario1.jpg";
        CLabel cq=new CLabel(32, 32,0, Color.BLACK, userPath);
        jPanelImgUser.add(cq);
        
        ImageIcon imgIcon = new ImageIcon("D:\\Java\\projectos\\cineMagicoAbancay\\src\\main\\java\\com\\unamba\\cinemagicoabancay\\body\\img\\Icons\\expandIcon.png");
        Image imgEscalada = imgIcon.getImage().getScaledInstance(jLabelIcon.getWidth(),jLabelIcon.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        jLabelIcon.setIcon(iconoEscalado);
        
        jPanelUserConfiguration.setVisible(false);
    }
    public void contentStart(){
        menuHomeClicked=1;
        jPanelHome.setBackground(new Color(51,51,51));
        homePanel hp=new homePanel();
        jPanelPrincipalBodyPart2.removeAll();
        jPanelPrincipalBodyPart2.add(hp,BorderLayout.CENTER);
        jPanelPrincipalBodyPart2.revalidate();
        jPanelPrincipalBodyPart2.repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenu = new javax.swing.JPanel();
        jPanelMenuHead = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jLabelTitle2 = new javax.swing.JLabel();
        jLabelTitle1 = new javax.swing.JLabel();
        jPanelHome = new javax.swing.JPanel();
        jLabelHome = new javax.swing.JLabel();
        jPanelBooking = new javax.swing.JPanel();
        jLabelBooking = new javax.swing.JLabel();
        jPanelBookingPart1 = new javax.swing.JPanel();
        jLabelBookingPart1 = new javax.swing.JLabel();
        jPanelBookingPart2 = new javax.swing.JPanel();
        jLabelBookingPart2 = new javax.swing.JLabel();
        jPanelReport = new javax.swing.JPanel();
        jLabelReport = new javax.swing.JLabel();
        jPanelPromotion = new javax.swing.JPanel();
        jLabelPromotion = new javax.swing.JLabel();
        jPanelFood_Drink = new javax.swing.JPanel();
        jLabelFood_Drink = new javax.swing.JLabel();
        jPanelFood_Drink1 = new javax.swing.JPanel();
        jLabelFood_Drink1 = new javax.swing.JLabel();
        jPanelFood_Drink2 = new javax.swing.JPanel();
        jLabelFoodDrink2 = new javax.swing.JLabel();
        jPanelAddUser = new javax.swing.JPanel();
        jLabelAddUser = new javax.swing.JLabel();
        jPanelPrincipal = new javax.swing.JPanel();
        jPanelPrincipalHead = new javax.swing.JPanel();
        jPanelElementsWindows = new javax.swing.JPanel();
        jLabelMin = new javax.swing.JLabel();
        jLabelExpand = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jPanelUser = new javax.swing.JPanel();
        jPanelImgUser = new javax.swing.JPanel();
        jPanelUserDate = new javax.swing.JPanel();
        jLabelUser = new javax.swing.JLabel();
        jLabelIcon = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jPanelUserConfiguration = new javax.swing.JPanel();
        jLabelEdit = new javax.swing.JLabel();
        jLabelCloseSession = new javax.swing.JLabel();
        jPanelPrincipalBodyPart2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanelMenu.setBackground(new java.awt.Color(0, 0, 0));

        jPanelMenuHead.setBackground(new java.awt.Color(0, 0, 0));

        jLabelTitle2.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabelTitle2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelTitle2.setText("Abancay");
        jLabelTitle2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabelTitle1.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabelTitle1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelTitle1.setText("Cine Mágico ");
        jLabelTitle1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanelMenuHeadLayout = new javax.swing.GroupLayout(jPanelMenuHead);
        jPanelMenuHead.setLayout(jPanelMenuHeadLayout);
        jPanelMenuHeadLayout.setHorizontalGroup(
            jPanelMenuHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuHeadLayout.createSequentialGroup()
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMenuHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitle2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanelMenuHeadLayout.setVerticalGroup(
            jPanelMenuHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuHeadLayout.createSequentialGroup()
                .addGroup(jPanelMenuHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelMenuHeadLayout.createSequentialGroup()
                        .addComponent(jLabelTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabelTitle2.getAccessibleContext().setAccessibleName("");

        jPanelHome.setBackground(new java.awt.Color(0, 0, 0));
        jPanelHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelHomeMouseExited(evt);
            }
        });

        jLabelHome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelHome.setForeground(new java.awt.Color(225, 225, 225));
        jLabelHome.setIcon(new javax.swing.ImageIcon("D:\\Java\\projectos\\cineMagicoAbancay\\src\\main\\java\\com\\unamba\\cinemagicoabancay\\body\\img\\Icons\\house.png")); // NOI18N
        jLabelHome.setText("Inicio");

        javax.swing.GroupLayout jPanelHomeLayout = new javax.swing.GroupLayout(jPanelHome);
        jPanelHome.setLayout(jPanelHomeLayout);
        jPanelHomeLayout.setHorizontalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHomeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelHomeLayout.setVerticalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelHome, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        jPanelBooking.setBackground(new java.awt.Color(0, 0, 0));
        jPanelBooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelBookingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelBookingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelBookingMouseExited(evt);
            }
        });

        jLabelBooking.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelBooking.setForeground(new java.awt.Color(225, 225, 225));
        jLabelBooking.setIcon(new javax.swing.ImageIcon("D:\\Java\\projectos\\cineMagicoAbancay\\src\\main\\java\\com\\unamba\\cinemagicoabancay\\body\\img\\Icons\\booking.png")); // NOI18N
        jLabelBooking.setText("Reservas");

        javax.swing.GroupLayout jPanelBookingLayout = new javax.swing.GroupLayout(jPanelBooking);
        jPanelBooking.setLayout(jPanelBookingLayout);
        jPanelBookingLayout.setHorizontalGroup(
            jPanelBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBookingLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelBookingLayout.setVerticalGroup(
            jPanelBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelBooking, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        jPanelBookingPart1.setBackground(new java.awt.Color(0, 0, 0));
        jPanelBookingPart1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelBookingPart1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelBookingPart1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelBookingPart1MouseExited(evt);
            }
        });

        jLabelBookingPart1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelBookingPart1.setForeground(new java.awt.Color(225, 225, 225));
        jLabelBookingPart1.setIcon(new javax.swing.ImageIcon("D:\\Java\\projectos\\cineMagicoAbancay\\src\\main\\java\\com\\unamba\\cinemagicoabancay\\body\\img\\Icons\\newClient.png")); // NOI18N
        jLabelBookingPart1.setText("Nuevo Cliente");

        javax.swing.GroupLayout jPanelBookingPart1Layout = new javax.swing.GroupLayout(jPanelBookingPart1);
        jPanelBookingPart1.setLayout(jPanelBookingPart1Layout);
        jPanelBookingPart1Layout.setHorizontalGroup(
            jPanelBookingPart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBookingPart1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelBookingPart1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelBookingPart1Layout.setVerticalGroup(
            jPanelBookingPart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelBookingPart1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelBookingPart2.setBackground(new java.awt.Color(0, 0, 0));
        jPanelBookingPart2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelBookingPart2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelBookingPart2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelBookingPart2MouseExited(evt);
            }
        });

        jLabelBookingPart2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelBookingPart2.setForeground(new java.awt.Color(225, 225, 225));
        jLabelBookingPart2.setIcon(new javax.swing.ImageIcon("D:\\Java\\projectos\\cineMagicoAbancay\\src\\main\\java\\com\\unamba\\cinemagicoabancay\\body\\img\\Icons\\regularClient.png")); // NOI18N
        jLabelBookingPart2.setText("Cliente Regular");

        javax.swing.GroupLayout jPanelBookingPart2Layout = new javax.swing.GroupLayout(jPanelBookingPart2);
        jPanelBookingPart2.setLayout(jPanelBookingPart2Layout);
        jPanelBookingPart2Layout.setHorizontalGroup(
            jPanelBookingPart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBookingPart2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelBookingPart2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelBookingPart2Layout.setVerticalGroup(
            jPanelBookingPart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelBookingPart2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelReport.setBackground(new java.awt.Color(0, 0, 0));
        jPanelReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelReportMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelReportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelReportMouseExited(evt);
            }
        });

        jLabelReport.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelReport.setForeground(new java.awt.Color(225, 225, 225));
        jLabelReport.setIcon(new javax.swing.ImageIcon("D:\\Java\\projectos\\cineMagicoAbancay\\src\\main\\java\\com\\unamba\\cinemagicoabancay\\body\\img\\Icons\\report.png")); // NOI18N
        jLabelReport.setText("Reporte");

        javax.swing.GroupLayout jPanelReportLayout = new javax.swing.GroupLayout(jPanelReport);
        jPanelReport.setLayout(jPanelReportLayout);
        jPanelReportLayout.setHorizontalGroup(
            jPanelReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelReportLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelReport, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelReportLayout.setVerticalGroup(
            jPanelReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelReport, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        jPanelPromotion.setBackground(new java.awt.Color(0, 0, 0));
        jPanelPromotion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelPromotionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelPromotionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelPromotionMouseExited(evt);
            }
        });

        jLabelPromotion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPromotion.setForeground(new java.awt.Color(225, 225, 225));
        jLabelPromotion.setIcon(new javax.swing.ImageIcon("D:\\Java\\projectos\\cineMagicoAbancay\\src\\main\\java\\com\\unamba\\cinemagicoabancay\\body\\img\\Icons\\promotion.png")); // NOI18N
        jLabelPromotion.setText("Promociones");

        javax.swing.GroupLayout jPanelPromotionLayout = new javax.swing.GroupLayout(jPanelPromotion);
        jPanelPromotion.setLayout(jPanelPromotionLayout);
        jPanelPromotionLayout.setHorizontalGroup(
            jPanelPromotionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPromotionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelPromotion, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelPromotionLayout.setVerticalGroup(
            jPanelPromotionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelPromotion, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        jPanelFood_Drink.setBackground(new java.awt.Color(0, 0, 0));
        jPanelFood_Drink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelFood_DrinkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelFood_DrinkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelFood_DrinkMouseExited(evt);
            }
        });

        jLabelFood_Drink.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelFood_Drink.setForeground(new java.awt.Color(225, 225, 225));
        jLabelFood_Drink.setIcon(new javax.swing.ImageIcon("D:\\Java\\projectos\\cineMagicoAbancay\\src\\main\\java\\com\\unamba\\cinemagicoabancay\\body\\img\\Icons\\food_drink.png")); // NOI18N
        jLabelFood_Drink.setText("Alimentos y bebidas");

        javax.swing.GroupLayout jPanelFood_DrinkLayout = new javax.swing.GroupLayout(jPanelFood_Drink);
        jPanelFood_Drink.setLayout(jPanelFood_DrinkLayout);
        jPanelFood_DrinkLayout.setHorizontalGroup(
            jPanelFood_DrinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFood_DrinkLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelFood_Drink, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelFood_DrinkLayout.setVerticalGroup(
            jPanelFood_DrinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelFood_Drink, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        jPanelFood_Drink1.setBackground(new java.awt.Color(0, 0, 0));
        jPanelFood_Drink1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelFood_Drink1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelFood_Drink1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelFood_Drink1MouseExited(evt);
            }
        });

        jLabelFood_Drink1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelFood_Drink1.setForeground(new java.awt.Color(225, 225, 225));
        jLabelFood_Drink1.setIcon(new javax.swing.ImageIcon("D:\\Java\\projectos\\cineMagicoAbancay\\src\\main\\java\\com\\unamba\\cinemagicoabancay\\body\\img\\Icons\\addFood.png")); // NOI18N
        jLabelFood_Drink1.setText("Agregar");

        javax.swing.GroupLayout jPanelFood_Drink1Layout = new javax.swing.GroupLayout(jPanelFood_Drink1);
        jPanelFood_Drink1.setLayout(jPanelFood_Drink1Layout);
        jPanelFood_Drink1Layout.setHorizontalGroup(
            jPanelFood_Drink1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFood_Drink1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelFood_Drink1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelFood_Drink1Layout.setVerticalGroup(
            jPanelFood_Drink1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelFood_Drink1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelFood_Drink2.setBackground(new java.awt.Color(0, 0, 0));
        jPanelFood_Drink2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelFood_Drink2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelFood_Drink2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelFood_Drink2MouseExited(evt);
            }
        });

        jLabelFoodDrink2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelFoodDrink2.setForeground(new java.awt.Color(225, 225, 225));
        jLabelFoodDrink2.setIcon(new javax.swing.ImageIcon("D:\\Java\\projectos\\cineMagicoAbancay\\src\\main\\java\\com\\unamba\\cinemagicoabancay\\body\\img\\Icons\\inventory.png")); // NOI18N
        jLabelFoodDrink2.setText("Inventario");

        javax.swing.GroupLayout jPanelFood_Drink2Layout = new javax.swing.GroupLayout(jPanelFood_Drink2);
        jPanelFood_Drink2.setLayout(jPanelFood_Drink2Layout);
        jPanelFood_Drink2Layout.setHorizontalGroup(
            jPanelFood_Drink2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFood_Drink2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelFoodDrink2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelFood_Drink2Layout.setVerticalGroup(
            jPanelFood_Drink2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelFoodDrink2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelAddUser.setBackground(new java.awt.Color(0, 0, 0));
        jPanelAddUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelAddUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelAddUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelAddUserMouseExited(evt);
            }
        });

        jLabelAddUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelAddUser.setForeground(new java.awt.Color(225, 225, 225));
        jLabelAddUser.setIcon(new javax.swing.ImageIcon("D:\\Java\\projectos\\cineMagicoAbancay\\src\\main\\java\\com\\unamba\\cinemagicoabancay\\body\\img\\Icons\\addUser.png")); // NOI18N
        jLabelAddUser.setText("Agregar usuario");

        javax.swing.GroupLayout jPanelAddUserLayout = new javax.swing.GroupLayout(jPanelAddUser);
        jPanelAddUser.setLayout(jPanelAddUserLayout);
        jPanelAddUserLayout.setHorizontalGroup(
            jPanelAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAddUserLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelAddUserLayout.setVerticalGroup(
            jPanelAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelAddUser, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenuHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBooking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBookingPart1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBookingPart2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelPromotion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelFood_Drink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelFood_Drink1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelFood_Drink2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelAddUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addComponent(jPanelMenuHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBooking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBookingPart1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBookingPart2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPromotion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelFood_Drink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelFood_Drink1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelFood_Drink2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 45, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelMenu, java.awt.BorderLayout.LINE_START);

        jPanelPrincipal.setBackground(new java.awt.Color(217, 217, 217));
        jPanelPrincipal.setLayout(new java.awt.BorderLayout());

        jPanelPrincipalHead.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelPrincipalHeadMouseDragged(evt);
            }
        });
        jPanelPrincipalHead.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelPrincipalHeadMousePressed(evt);
            }
        });

        jPanelElementsWindows.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelMin.setFont(new java.awt.Font("Verdana", 0, 26)); // NOI18N
        jLabelMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMin.setText("-");
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMinMouseExited(evt);
            }
        });
        jPanelElementsWindows.add(jLabelMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 47, 26));

        jLabelExpand.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelExpand.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelExpand.setText("■");
        jLabelExpand.setSize(30,30);
        jLabelExpand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelExpandMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelExpandMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelExpandMouseExited(evt);
            }
        });
        jPanelElementsWindows.add(jLabelExpand, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 0, 47, 26));

        jLabelClose.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabelClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClose.setText("X");
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseExited(evt);
            }
        });
        jPanelElementsWindows.add(jLabelClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 0, 47, 26));

        jLabelDate.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabelDate.setText("Lunes  26/12/2022    18:20");

        jPanelUser.setPreferredSize(new java.awt.Dimension(150, 30));

        jPanelImgUser.setBackground(new java.awt.Color(120, 220, 255));

        javax.swing.GroupLayout jPanelImgUserLayout = new javax.swing.GroupLayout(jPanelImgUser);
        jPanelImgUser.setLayout(jPanelImgUserLayout);
        jPanelImgUserLayout.setHorizontalGroup(
            jPanelImgUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );
        jPanelImgUserLayout.setVerticalGroup(
            jPanelImgUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        jPanelUserDate.setBackground(new java.awt.Color(120, 220, 255));
        jPanelUserDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelUserDateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelUserDateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelUserDateMouseExited(evt);
            }
        });

        jLabelUser.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabelUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelUser.setText("Usuario12341212");
        jLabelUser.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabelName.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabelName.setText("Jose Gutierrez Gomez");

        javax.swing.GroupLayout jPanelUserDateLayout = new javax.swing.GroupLayout(jPanelUserDate);
        jPanelUserDate.setLayout(jPanelUserDateLayout);
        jPanelUserDateLayout.setHorizontalGroup(
            jPanelUserDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanelUserDateLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelUserDateLayout.setVerticalGroup(
            jPanelUserDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanelUserDateLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelName))
            .addGroup(jPanelUserDateLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabelEdit.setText("Editar");
        jLabelEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEditMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelEditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelEditMouseExited(evt);
            }
        });

        jLabelCloseSession.setText("Cerrar Sesión");
        jLabelCloseSession.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseSessionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCloseSessionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCloseSessionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelUserConfigurationLayout = new javax.swing.GroupLayout(jPanelUserConfiguration);
        jPanelUserConfiguration.setLayout(jPanelUserConfigurationLayout);
        jPanelUserConfigurationLayout.setHorizontalGroup(
            jPanelUserConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUserConfigurationLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanelUserConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCloseSession, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanelUserConfigurationLayout.setVerticalGroup(
            jPanelUserConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUserConfigurationLayout.createSequentialGroup()
                .addComponent(jLabelEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabelCloseSession, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanelUserLayout = new javax.swing.GroupLayout(jPanelUser);
        jPanelUser.setLayout(jPanelUserLayout);
        jPanelUserLayout.setHorizontalGroup(
            jPanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelUserConfiguration, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelUserLayout.createSequentialGroup()
                        .addComponent(jPanelImgUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanelUserDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanelUserLayout.setVerticalGroup(
            jPanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUserLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanelImgUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelUserLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanelUserDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelUserLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanelUserConfiguration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanelPrincipalHeadLayout = new javax.swing.GroupLayout(jPanelPrincipalHead);
        jPanelPrincipalHead.setLayout(jPanelPrincipalHeadLayout);
        jPanelPrincipalHeadLayout.setHorizontalGroup(
            jPanelPrincipalHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalHeadLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jPanelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelElementsWindows, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelPrincipalHeadLayout.setVerticalGroup(
            jPanelPrincipalHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalHeadLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanelUser, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
            .addGroup(jPanelPrincipalHeadLayout.createSequentialGroup()
                .addGroup(jPanelPrincipalHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelElementsWindows, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelPrincipalHeadLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabelDate)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanelPrincipal.add(jPanelPrincipalHead, java.awt.BorderLayout.PAGE_START);

        jPanelPrincipalBodyPart2.setLayout(new java.awt.BorderLayout());
        jPanelPrincipal.add(jPanelPrincipalBodyPart2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanelPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Allows you to drag the window
    private void jPanelPrincipalHeadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelPrincipalHeadMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_jPanelPrincipalHeadMousePressed
    private void jPanelPrincipalHeadMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelPrincipalHeadMouseDragged
        int x=evt.getXOnScreen(),y=evt.getYOnScreen();
        
        this.setLocation((x-xMouse)-jPanelMenu.getWidth(),y-yMouse-20);
    }//GEN-LAST:event_jPanelPrincipalHeadMouseDragged
    //minimize, expand and close events
    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jLabelMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseEntered
        jLabelMin.setOpaque(true);
        jLabelMin.setBackground(new Color(210,210,210));
    }//GEN-LAST:event_jLabelMinMouseEntered

    private void jLabelMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseExited
        jLabelMin.setBackground(new Color(242,242,242));
        jLabelMin.setOpaque(false);
    }//GEN-LAST:event_jLabelMinMouseExited

    private void jLabelCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseEntered
        jLabelClose.setBackground(Color.RED);
        jLabelClose.setOpaque(true);
    }//GEN-LAST:event_jLabelCloseMouseEntered

    private void jLabelCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseExited
        jLabelClose.setBackground(new Color(242,242,242));
        jLabelClose.setOpaque(false);
    }//GEN-LAST:event_jLabelCloseMouseExited

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelExpandMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExpandMouseEntered
        jLabelExpand.setOpaque(true);
        jLabelExpand.setBackground(new Color(210,210,210));
    }//GEN-LAST:event_jLabelExpandMouseEntered

    private void jLabelExpandMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExpandMouseExited
        jLabelExpand.setBackground(new Color(242,242,242));
        jLabelExpand.setOpaque(false);
    }//GEN-LAST:event_jLabelExpandMouseExited

    private void jLabelExpandMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExpandMouseClicked
        if(this.getExtendedState()==MAXIMIZED_BOTH){
            this.setExtendedState(NORMAL);
        }else{
            this.setExtendedState(MAXIMIZED_BOTH);
        }
    }//GEN-LAST:event_jLabelExpandMouseClicked
    //menu botons events
    private void jPanelHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHomeMouseEntered
        if(menuHomeClicked==0){
            jPanelHome.setBackground(new Color(51,51,51));
        }
    }//GEN-LAST:event_jPanelHomeMouseEntered

    private void jPanelHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHomeMouseExited
        if(menuHomeClicked==0){
            jPanelHome.setBackground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jPanelHomeMouseExited

    private void jPanelBookingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBookingMouseEntered
        if(menuBookingClicked==0){
            jPanelBooking.setBackground(new Color(51,51,51));
        }
    }//GEN-LAST:event_jPanelBookingMouseEntered

    private void jPanelBookingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBookingMouseExited
        if(menuBookingClicked==0){
            jPanelBooking.setBackground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jPanelBookingMouseExited

    private void jPanelHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHomeMouseClicked
        //clicked
        menuHomeClicked=1;
        menuBookingClicked=0;
        reportClicked=0;
        promotionClicked=0;
        Food_DrinkClicked=0;
        addUserClicked=0;
        //background
        jPanelHome.setBackground(new Color(51,51,51));
        jPanelBooking.setBackground(new Color(0,0,0));
        jPanelReport.setBackground(new Color(0,0,0));
        jPanelPromotion.setBackground(new Color(0,0,0));
        jPanelFood_Drink.setBackground(new Color(0,0,0));
        jPanelAddUser.setBackground(new Color(0,0,0));
        
        //closed buttons booking
        jPanelBookingPart1.setVisible(false);
        jPanelBookingPart1.setBackground(new Color(0,0,0));
        jPanelBookingPart2.setVisible(false);
        jPanelBookingPart2.setBackground(new Color(0,0,0));
        BookingPart1Clicked=0;
        BookingPart2Clicked=0;
        
        //closed buttons Food_Drink
        jPanelFood_Drink1.setVisible(false);
        jPanelFood_Drink1.setBackground(new Color(0,0,0));
        jPanelFood_Drink2.setVisible(false);
        jPanelFood_Drink2.setBackground(new Color(0,0,0));
        addFood_DrinkClicked=0;
        inventoryClicked=0;
              
        //action
        homePanel hp=new homePanel();
        jPanelPrincipalBodyPart2.removeAll();
        jPanelPrincipalBodyPart2.add(hp,BorderLayout.CENTER);
        jPanelPrincipalBodyPart2.revalidate();
        jPanelPrincipalBodyPart2.repaint();
    }//GEN-LAST:event_jPanelHomeMouseClicked

    private void jPanelBookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBookingMouseClicked
        //clicked
        menuHomeClicked=0;
        menuBookingClicked+=1;
        reportClicked=0;
        promotionClicked=0;
        Food_DrinkClicked=0;
        addUserClicked=0;
        //background
        jPanelHome.setBackground(new Color(0,0,0));
        jPanelBooking.setBackground(new Color(51,51,51));
        jPanelReport.setBackground(new Color(0,0,0));
        jPanelPromotion.setBackground(new Color(0,0,0));
        jPanelFood_Drink.setBackground(new Color(0,0,0));
        jPanelAddUser.setBackground(new Color(0,0,0));
        
        //closed buttons booking
        /*jPanelBookingPart1.setVisible(false);
        jPanelBookingPart1.setBackground(new Color(0,0,0));
        jPanelBookingPart2.setVisible(false);
        jPanelBookingPart2.setBackground(new Color(0,0,0));
        BookingPart1Clicked=0;
        BookingPart2Clicked=0;*/        
        
        //closed buttons Food_Drink
        jPanelFood_Drink1.setVisible(false);
        jPanelFood_Drink1.setBackground(new Color(0,0,0));
        jPanelFood_Drink2.setVisible(false);
        jPanelFood_Drink2.setBackground(new Color(0,0,0));
        addFood_DrinkClicked=0;
        inventoryClicked=0;
        
        //subBottons
        jPanelBookingPart1.setVisible(true);
        jPanelBookingPart2.setVisible(true);
        if(menuBookingClicked==2){
            jPanelBookingPart1.setVisible(false);
            jPanelBookingPart2.setVisible(false);
            menuBookingClicked=0;
        }
        //
    }//GEN-LAST:event_jPanelBookingMouseClicked

    private void jPanelUserDateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelUserDateMouseEntered
        if(userClicked==0){
            jPanelUserDate.setBackground(new Color(57,167,225));
            jPanelImgUser.setBackground(new Color(57,167,225));
        }
    }//GEN-LAST:event_jPanelUserDateMouseEntered

    private void jPanelUserDateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelUserDateMouseExited
        if(userClicked==0){
            jPanelUserDate.setBackground(new Color(120,220,255));
            jPanelImgUser.setBackground(new Color(120,220,255));
        }
    }//GEN-LAST:event_jPanelUserDateMouseExited

    private void jPanelUserDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelUserDateMouseClicked
        userClicked+=1;
        if(userClicked==1){
            ImageIcon imgIcon = new ImageIcon("D:\\Java\\projectos\\cineMagicoAbancay\\src\\main\\java\\com\\unamba\\cinemagicoabancay\\body\\img\\Icons\\contractIcon.png");
            Image imgEscalada = imgIcon.getImage().getScaledInstance(jLabelIcon.getWidth(),jLabelIcon.getHeight(), Image.SCALE_SMOOTH);
            Icon iconoEscalado = new ImageIcon(imgEscalada);
            jLabelIcon.setIcon(iconoEscalado);
            jPanelUserDate.setBackground(new Color(57,167,225));
            jPanelImgUser.setBackground(new Color(57,167,225));
            jPanelUserConfiguration.setBackground(new Color(120,220,255));
            jPanelUserConfiguration.setVisible(true);

        }
        if(userClicked==2){
            ImageIcon imgIcon = new ImageIcon("D:\\Java\\projectos\\cineMagicoAbancay\\src\\main\\java\\com\\unamba\\cinemagicoabancay\\body\\img\\Icons\\expandIcon.png");
            Image imgEscalada = imgIcon.getImage().getScaledInstance(jLabelIcon.getWidth(),jLabelIcon.getHeight(), Image.SCALE_SMOOTH);
            Icon iconoEscalado = new ImageIcon(imgEscalada);
            jLabelIcon.setIcon(iconoEscalado);
            userClicked=0;
            jPanelUserConfiguration.setVisible(false);
            editClicked=0;
            closedClicked=0;
            jLabelEdit.setBackground(new Color(120,220,255));
            jLabelCloseSession.setBackground(new Color(120,220,255));
        }
        
    }//GEN-LAST:event_jPanelUserDateMouseClicked

    private void jLabelEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEditMouseEntered
        if(editClicked==0){
            jLabelEdit.setBackground(new Color(57,167,225));
            jLabelEdit.setOpaque(true);
        }
    }//GEN-LAST:event_jLabelEditMouseEntered

    private void jLabelEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEditMouseExited
        if(editClicked==0){
            jLabelEdit.setBackground(new Color(120,220,255));
            jLabelEdit.setOpaque(false);
        }
    }//GEN-LAST:event_jLabelEditMouseExited

    private void jLabelCloseSessionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseSessionMouseEntered
        if(closedClicked==0){
            jLabelCloseSession.setBackground(new Color(57,167,225));
            jLabelCloseSession.setOpaque(true);
        }
    }//GEN-LAST:event_jLabelCloseSessionMouseEntered

    private void jLabelCloseSessionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseSessionMouseExited
        if(closedClicked==0){
            jLabelCloseSession.setBackground(new Color(120,220,255));
            jLabelCloseSession.setOpaque(false);
        }
    }//GEN-LAST:event_jLabelCloseSessionMouseExited

    private void jLabelEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEditMouseClicked
        editClicked=1;
        closedClicked=0;
        jLabelEdit.setBackground(new Color(57,167,225));
        jLabelCloseSession.setBackground(new Color(120,220,255));
        editPanel ep=new editPanel();
        jPanelPrincipalBodyPart2.removeAll();
        jPanelPrincipalBodyPart2.add(ep,BorderLayout.CENTER);
        jPanelPrincipalBodyPart2.revalidate();
        jPanelPrincipalBodyPart2.repaint();
    }//GEN-LAST:event_jLabelEditMouseClicked

    private void jLabelCloseSessionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseSessionMouseClicked
        editClicked=0;
        closedClicked=1;
        jLabelCloseSession.setBackground(new Color(57,167,225));
        jLabelEdit.setBackground(new Color(120,220,255));
        CloseSessionPanel ep=new CloseSessionPanel();
        jPanelPrincipalBodyPart2.removeAll();
        jPanelPrincipalBodyPart2.add(ep,BorderLayout.CENTER);
        jPanelPrincipalBodyPart2.revalidate();
        jPanelPrincipalBodyPart2.repaint();
    }//GEN-LAST:event_jLabelCloseSessionMouseClicked

    private void jPanelBookingPart1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBookingPart1MouseClicked
        BookingPart1Clicked=1;
        jPanelBookingPart1.setBackground(new Color(51,51,51));
        jPanelBookingPart2.setBackground(new Color(0,0,0));
        BookingPart2Clicked=0;
        //action
        bookingPanelAdd bp=new bookingPanelAdd();
        jPanelPrincipalBodyPart2.removeAll();
        jPanelPrincipalBodyPart2.add(bp,BorderLayout.CENTER);
        jPanelPrincipalBodyPart2.revalidate();
        jPanelPrincipalBodyPart2.repaint();
    }//GEN-LAST:event_jPanelBookingPart1MouseClicked

    private void jPanelBookingPart1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBookingPart1MouseEntered
        if(BookingPart1Clicked==0){
            jPanelBookingPart1.setBackground(new Color(51,51,51));
        }
    }//GEN-LAST:event_jPanelBookingPart1MouseEntered

    private void jPanelBookingPart1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBookingPart1MouseExited
        if(BookingPart1Clicked==0){
            jPanelBookingPart1.setBackground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jPanelBookingPart1MouseExited

    private void jPanelReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelReportMouseClicked
        //clicked
        menuHomeClicked=0;
        menuBookingClicked=0;
        reportClicked=1;
        promotionClicked=0;
        Food_DrinkClicked=0;
        addUserClicked=0;
        //background
        jPanelHome.setBackground(new Color(0,0,0));
        jPanelBooking.setBackground(new Color(0,0,0));
        jPanelReport.setBackground(new Color(51,51,51));
        jPanelPromotion.setBackground(new Color(0,0,0));
        jPanelFood_Drink.setBackground(new Color(0,0,0));
        jPanelAddUser.setBackground(new Color(0,0,0));
        
        //closed buttons booking
        jPanelBookingPart1.setVisible(false);
        jPanelBookingPart1.setBackground(new Color(0,0,0));
        jPanelBookingPart2.setVisible(false);
        jPanelBookingPart2.setBackground(new Color(0,0,0));
        BookingPart1Clicked=0;
        BookingPart2Clicked=0;       
        
        //closed buttons Food_Drink
        jPanelFood_Drink1.setVisible(false);
        jPanelFood_Drink1.setBackground(new Color(0,0,0));
        jPanelFood_Drink2.setVisible(false);
        jPanelFood_Drink2.setBackground(new Color(0,0,0));
        addFood_DrinkClicked=0;
        inventoryClicked=0;
        
        //action
        reportPanel hp=new reportPanel();
        jPanelPrincipalBodyPart2.removeAll();
        jPanelPrincipalBodyPart2.add(hp,BorderLayout.CENTER);
        jPanelPrincipalBodyPart2.revalidate();
        jPanelPrincipalBodyPart2.repaint();
    }//GEN-LAST:event_jPanelReportMouseClicked

    private void jPanelReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelReportMouseEntered
        if(reportClicked==0){
            jPanelReport.setBackground(new Color(51,51,51));
        }
    }//GEN-LAST:event_jPanelReportMouseEntered

    private void jPanelReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelReportMouseExited
        if(reportClicked==0){
            jPanelReport.setBackground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jPanelReportMouseExited

    private void jPanelBookingPart2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBookingPart2MouseClicked
        BookingPart2Clicked=1;
        jPanelBookingPart2.setBackground(new Color(51,51,51));
        jPanelBookingPart1.setBackground(new Color(0,0,0));
        BookingPart1Clicked=0;
        //action
        bookingPanelClient bp=new bookingPanelClient();
        jPanelPrincipalBodyPart2.removeAll();
        jPanelPrincipalBodyPart2.add(bp,BorderLayout.CENTER);
        jPanelPrincipalBodyPart2.revalidate();
        jPanelPrincipalBodyPart2.repaint();     
        
    }//GEN-LAST:event_jPanelBookingPart2MouseClicked

    private void jPanelBookingPart2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBookingPart2MouseEntered
        if(BookingPart2Clicked==0){
            jPanelBookingPart2.setBackground(new Color(51,51,51));
        }
    }//GEN-LAST:event_jPanelBookingPart2MouseEntered

    private void jPanelBookingPart2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBookingPart2MouseExited
        if(BookingPart2Clicked==0){
            jPanelBookingPart2.setBackground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jPanelBookingPart2MouseExited

    private void jPanelFood_DrinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelFood_DrinkMouseClicked
        //clicked
        menuHomeClicked=0;
        menuBookingClicked=0;
        reportClicked=0;
        promotionClicked=0;
        Food_DrinkClicked+=1;
        addUserClicked=0;
        //background
        jPanelHome.setBackground(new Color(0,0,0));
        jPanelBooking.setBackground(new Color(0,0,0));
        jPanelReport.setBackground(new Color(0,0,0));
        jPanelPromotion.setBackground(new Color(0,0,0));
        jPanelFood_Drink.setBackground(new Color(51,51,51));
        jPanelAddUser.setBackground(new Color(0,0,0));
        
        //closed buttons booking
        jPanelBookingPart1.setVisible(false);
        jPanelBookingPart1.setBackground(new Color(0,0,0));
        jPanelBookingPart2.setVisible(false);
        jPanelBookingPart2.setBackground(new Color(0,0,0));
        BookingPart1Clicked=0;
        BookingPart2Clicked=0;       
        
        //closed buttons Food_Drink
        /*
        jPanelFood_Drink1.setVisible(false);
        jPanelFood_Drink1.setBackground(new Color(0,0,0));
        jPanelFood_Drink2.setVisible(false);
        jPanelFood_Drink2.setBackground(new Color(0,0,0));
        addFood_DrinkClicked=0;
        inventoryClicked=0;*/  
        
        if(Food_DrinkClicked==1){
            jPanelFood_Drink1.setVisible(true);
            jPanelFood_Drink2.setVisible(true);
        }
        if(Food_DrinkClicked==2){
            jPanelFood_Drink1.setVisible(false);
            jPanelFood_Drink2.setVisible(false);
            Food_DrinkClicked=0;
        }
    }//GEN-LAST:event_jPanelFood_DrinkMouseClicked

    private void jPanelFood_DrinkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelFood_DrinkMouseEntered
        if(Food_DrinkClicked==0){
            jPanelFood_Drink.setBackground(new Color(51,51,51));
        }
    }//GEN-LAST:event_jPanelFood_DrinkMouseEntered

    private void jPanelFood_DrinkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelFood_DrinkMouseExited
        if(Food_DrinkClicked==0){
            jPanelFood_Drink.setBackground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jPanelFood_DrinkMouseExited

    private void jPanelPromotionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelPromotionMouseClicked
        //clicked
        menuHomeClicked=0;
        menuBookingClicked=0;
        reportClicked=0;
        promotionClicked=1;
        Food_DrinkClicked=0;
        addUserClicked=0;
        //background
        jPanelHome.setBackground(new Color(0,0,0));
        jPanelBooking.setBackground(new Color(0,0,0));
        jPanelReport.setBackground(new Color(0,0,0));
        jPanelPromotion.setBackground(new Color(51,51,51));
        jPanelFood_Drink.setBackground(new Color(0,0,0));
        jPanelAddUser.setBackground(new Color(0,0,0));
        
        //closed buttons booking
        jPanelBookingPart1.setVisible(false);
        jPanelBookingPart1.setBackground(new Color(0,0,0));
        jPanelBookingPart2.setVisible(false);
        jPanelBookingPart2.setBackground(new Color(0,0,0));
        BookingPart1Clicked=0;
        BookingPart2Clicked=0;       
        
        //closed buttons Food_Drink
        jPanelFood_Drink1.setVisible(false);
        jPanelFood_Drink1.setBackground(new Color(0,0,0));
        jPanelFood_Drink2.setVisible(false);
        jPanelFood_Drink2.setBackground(new Color(0,0,0));
        addFood_DrinkClicked=0;
        inventoryClicked=0;
        
        //action
        promotionPanel pl=new promotionPanel();
        jPanelPrincipalBodyPart2.removeAll();
        jPanelPrincipalBodyPart2.add(pl,BorderLayout.CENTER);
        jPanelPrincipalBodyPart2.revalidate();
        jPanelPrincipalBodyPart2.repaint();
        
        
    }//GEN-LAST:event_jPanelPromotionMouseClicked

    private void jPanelPromotionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelPromotionMouseEntered
        if(promotionClicked==0){
            jPanelPromotion.setBackground(new Color(51,51,51));
        }
    }//GEN-LAST:event_jPanelPromotionMouseEntered

    private void jPanelPromotionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelPromotionMouseExited
        if(promotionClicked==0){
            jPanelPromotion.setBackground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jPanelPromotionMouseExited

    private void jPanelFood_Drink1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelFood_Drink1MouseClicked
        addFood_DrinkClicked=1;
        jPanelFood_Drink1.setBackground(new Color(51,51,51));
        jPanelFood_Drink2.setBackground(new Color(0,0,0));
        inventoryClicked=0;
        //action
        addFood_DrinkPanel pl=new addFood_DrinkPanel();
        jPanelPrincipalBodyPart2.removeAll();
        jPanelPrincipalBodyPart2.add(pl,BorderLayout.CENTER);
        jPanelPrincipalBodyPart2.revalidate();
        jPanelPrincipalBodyPart2.repaint();
    }//GEN-LAST:event_jPanelFood_Drink1MouseClicked

    private void jPanelFood_Drink1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelFood_Drink1MouseEntered
        if(addFood_DrinkClicked==0){
            jPanelFood_Drink1.setBackground(new Color(51,51,51));
        }
    }//GEN-LAST:event_jPanelFood_Drink1MouseEntered

    private void jPanelFood_Drink1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelFood_Drink1MouseExited
        if(addFood_DrinkClicked==0){
            jPanelFood_Drink1.setBackground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jPanelFood_Drink1MouseExited

    private void jPanelFood_Drink2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelFood_Drink2MouseClicked
        inventoryClicked=1;
        jPanelFood_Drink2.setBackground(new Color(51,51,51));
        jPanelFood_Drink1.setBackground(new Color(0,0,0));
        addFood_DrinkClicked=0;
        inventoryFood_DrinkPanel pl=new inventoryFood_DrinkPanel();
        jPanelPrincipalBodyPart2.removeAll();
        jPanelPrincipalBodyPart2.add(pl,BorderLayout.CENTER);
        jPanelPrincipalBodyPart2.revalidate();
        jPanelPrincipalBodyPart2.repaint();
    }//GEN-LAST:event_jPanelFood_Drink2MouseClicked

    private void jPanelFood_Drink2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelFood_Drink2MouseEntered
        if(inventoryClicked==0){
            jPanelFood_Drink2.setBackground(new Color(51,51,51));
        }
    }//GEN-LAST:event_jPanelFood_Drink2MouseEntered

    private void jPanelFood_Drink2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelFood_Drink2MouseExited
        if(inventoryClicked==0){
            jPanelFood_Drink2.setBackground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jPanelFood_Drink2MouseExited

    private void jPanelAddUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAddUserMouseClicked
        //clicked
        menuHomeClicked=0;
        menuBookingClicked=0;
        reportClicked=0;
        promotionClicked=0;
        Food_DrinkClicked=0;
        addUserClicked=1;
        //background
        jPanelHome.setBackground(new Color(0,0,0));
        jPanelBooking.setBackground(new Color(0,0,0));
        jPanelReport.setBackground(new Color(0,0,0));
        jPanelPromotion.setBackground(new Color(0,0,0));
        jPanelFood_Drink.setBackground(new Color(0,0,0));
        jPanelAddUser.setBackground(new Color(51,51,51));
        
        //closed buttons booking
        jPanelBookingPart1.setVisible(false);
        jPanelBookingPart1.setBackground(new Color(0,0,0));
        jPanelBookingPart2.setVisible(false);
        jPanelBookingPart2.setBackground(new Color(0,0,0));
        BookingPart1Clicked=0;
        BookingPart2Clicked=0;       
        
        //closed buttons Food_Drink
        jPanelFood_Drink1.setVisible(false);
        jPanelFood_Drink1.setBackground(new Color(0,0,0));
        jPanelFood_Drink2.setVisible(false);
        jPanelFood_Drink2.setBackground(new Color(0,0,0));
        addFood_DrinkClicked=0;
        inventoryClicked=0;
        //action
        addUserPanel pl=new addUserPanel();
        jPanelPrincipalBodyPart2.removeAll();
        jPanelPrincipalBodyPart2.add(pl,BorderLayout.CENTER);
        jPanelPrincipalBodyPart2.revalidate();
        jPanelPrincipalBodyPart2.repaint();
    }//GEN-LAST:event_jPanelAddUserMouseClicked

    private void jPanelAddUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAddUserMouseEntered
        if(addUserClicked==0){
            jPanelAddUser.setBackground(new Color(51,51,51));
        }
    }//GEN-LAST:event_jPanelAddUserMouseEntered

    private void jPanelAddUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAddUserMouseExited
        if(addUserClicked==0){
            jPanelAddUser.setBackground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jPanelAddUserMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelAddUser;
    private javax.swing.JLabel jLabelBooking;
    private javax.swing.JLabel jLabelBooking1;
    private javax.swing.JLabel jLabelBookingPart1;
    private javax.swing.JLabel jLabelBookingPart2;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelCloseSession;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelEdit;
    private javax.swing.JLabel jLabelExpand;
    private javax.swing.JLabel jLabelFoodDrink2;
    private javax.swing.JLabel jLabelFood_Drink;
    private javax.swing.JLabel jLabelFood_Drink1;
    private javax.swing.JLabel jLabelHome;
    private javax.swing.JLabel jLabelIcon;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPromotion;
    private javax.swing.JLabel jLabelReport;
    private javax.swing.JLabel jLabelTitle1;
    private javax.swing.JLabel jLabelTitle2;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelAddUser;
    private javax.swing.JPanel jPanelBooking;
    private javax.swing.JPanel jPanelBooking1;
    private javax.swing.JPanel jPanelBookingPart1;
    private javax.swing.JPanel jPanelBookingPart2;
    private javax.swing.JPanel jPanelElementsWindows;
    private javax.swing.JPanel jPanelFood_Drink;
    private javax.swing.JPanel jPanelFood_Drink1;
    private javax.swing.JPanel jPanelFood_Drink2;
    private javax.swing.JPanel jPanelHome;
    private javax.swing.JPanel jPanelImgUser;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelMenuHead;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelPrincipalBodyPart2;
    private javax.swing.JPanel jPanelPrincipalHead;
    private javax.swing.JPanel jPanelPromotion;
    private javax.swing.JPanel jPanelReport;
    private javax.swing.JPanel jPanelUser;
    private javax.swing.JPanel jPanelUserConfiguration;
    private javax.swing.JPanel jPanelUserDate;
    // End of variables declaration//GEN-END:variables
}
