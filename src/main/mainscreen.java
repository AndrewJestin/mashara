package main;

import javax.swing.*;
import java.awt.*;

import static main.adminscreen.*;
/**
 * Created by Daha on 24.04.2017.
 */


    /**
     * Created by Andrew on 24.02.2017.
     */

    public class mainscreen {
        public static JLabel lblcategory = new JLabel("ADULT MALE -64kg.");
        public static JLabel lblmatch = new JLabel("Match No.");
       // public static JLabel leader = new JLabel("DRAW");
        public static JLabel lblMatchNo = new JLabel(lblMatchNo1.getText());
        public static JLabel Umpire1 = new JLabel(img);
        public static JLabel Umpire2 = new JLabel(img);
        public static JLabel Umpire3 = new JLabel(img);
        public static JLabel Umpire4 = new JLabel(img);

        public static JLabel rpenalty = new JLabel("0");
        public static JLabel bpenalty = new JLabel("0");
        public static JLabel nlblrnd1 = new JLabel("1 Rnd.");
        public static JLabel nlblrnd2 = new JLabel("2 Rnd.");
        public static JLabel rs1 = new JLabel("0");
        public static JLabel bs1 = new JLabel("0");
        public static JLabel rs2 = new JLabel("0");
        public static JLabel bs2 = new JLabel("0");
        public static JLabel rs3 = new JLabel("0");
        public static JLabel bs3 = new JLabel("0");
        public static JLabel rs4 = new JLabel("0");
        public static JLabel bs4 = new JLabel("0");
        public static JLabel rcompetitor = new JLabel("Red");
        public static JLabel bcompetitor = new JLabel("Blue");


        public static JLabel kickred1 = new JLabel("");
        public static JLabel kickred2 = new JLabel("");
        public static JLabel kickblue1 = new JLabel("");
        public static JLabel kickblue2 = new JLabel("");
        public static JLabel btotal = new JLabel("0");

        public static JLabel rwarnings = new JLabel("0");
        public static JLabel bwarnings = new JLabel("0");
        public static JLabel rtotal = new JLabel("0");
        public static JLabel round = new JLabel("ROUND : "+rndnum);
        public static JLabel lbltimer1 = new JLabel("00:00");
        // public static JLabel lblkicks2 = new JLabel("Compulsory techniques ");
        //gamepad



        public JPanel createContentPane() {


            JPanel totalGUI = new JPanel();
            totalGUI.setLayout(null);


//        lblkicks2.setLocation(530, 410);
//        lblkicks2.setSize(250, 20);
//        lblkicks2.setForeground(Color.black);
//        lblkicks2.setFont(new Font("Arial", Font.BOLD, 20));
//        lblkicks2.setVisible(false);
//        totalGUI.add(lblkicks2);
// категория
            lblcategory.setLocation(400, 5);
            lblcategory.setSize(850, 60);
            lblcategory.setForeground(Color.white);
            lblcategory.setBackground(Color.black);
            lblcategory.setVerticalAlignment(0);
            lblcategory.setHorizontalAlignment(4);
            lblcategory.setFont(new Font("Arial", Font.BOLD, 40));
            //  lblcategory.setBorder(BorderFactory.createLineBorder(Color.black));
            // timer.setBackground(Color.yellow);
            lblcategory.setOpaque(true);
            lblcategory.setVisible(false);
            totalGUI.add(lblcategory);
// номер боя (надпись)
            lblmatch.setLocation(0, 505);
            lblmatch.setSize(170, 40);
            lblmatch.setHorizontalAlignment(0);
            lblmatch.setForeground(Color.white);
            lblmatch.setVerticalAlignment(0);
            lblmatch.setBackground(Color.black);
            lblmatch.setFont(new Font("Arial", Font.BOLD, 25));
            // lblmatch.setBorder(BorderFactory.createLineBorder(Color.black,5));
            lblmatch.setOpaque(true);
            lblmatch.setVisible(false);
            totalGUI.add(lblmatch);
// номер боя


            lblMatchNo.setLocation(10, 555);
            lblMatchNo.setSize(140, 135);
            lblMatchNo.setHorizontalAlignment(0);
            lblMatchNo.setVerticalAlignment(0);
            lblMatchNo.setFont(new Font("Arial", Font.BOLD, 70));
            lblMatchNo.setForeground(Color.white);
            lblMatchNo.setBorder(BorderFactory.createLineBorder(Color.white,5));
            lblMatchNo.setBackground(Color.black);
            lblMatchNo.setOpaque(true);
            lblMatchNo.setVisible(false);
            totalGUI.add(lblMatchNo);
//      таймер

            lbltimer1.setLocation(440, 2);
            lbltimer1.setSize(400, 120);
            lbltimer1.setHorizontalAlignment(0);
            lbltimer1.setVerticalAlignment(0);
            lbltimer1.setFont(new Font("Arial", Font.BOLD, 135));
            lbltimer1.setForeground(Color.white);
            lbltimer1.setBackground(Color.black);
            lbltimer1.setOpaque(true);
            totalGUI.add(lbltimer1);
//   кто побеждает

//            leader.setLocation(400, 210);
//            leader.setSize(480, 140);
//            leader.setHorizontalAlignment(0);
//            leader.setFont(new Font("Arial",Font.BOLD,70));
//            leader.setBackground(Color.black);
//            leader.setOpaque(true);
//            leader.setBorder(BorderFactory.createLineBorder(Color.white,3));
//            leader.setForeground(Color.white);
//            totalGUI.add(leader);


            // номера судей

            Umpire1.setLocation(705, 495);
            Umpire1.setSize(85, 55);
            Umpire1.setHorizontalAlignment(0);
            Umpire1.setFont(new Font("Arial",Font.BOLD,20));
            Umpire1.setBackground(Color.black);
            Umpire1.setOpaque(true);
            Umpire1.setBorder(BorderFactory.createLineBorder(Color.white));
            Umpire1.setForeground(Color.white);
            Umpire1.setVisible(false);
            totalGUI.add(Umpire1);

            Umpire2.setLocation(855, 495);
            Umpire2.setSize(85, 55);
            Umpire2.setHorizontalAlignment(0);
            Umpire2.setFont(new Font("Arial",Font.BOLD,20));
            Umpire2.setBackground(Color.black);
            Umpire2.setOpaque(true);
            Umpire2.setBorder(BorderFactory.createLineBorder(Color.white));
            Umpire2.setForeground(Color.white);
            Umpire2.setVisible(false);
            totalGUI.add(Umpire2);

            Umpire3.setLocation(1005, 495);
            Umpire3.setSize(85, 55);
            Umpire3.setHorizontalAlignment(0);
            Umpire3.setFont(new Font("Arial",Font.BOLD,20));
            Umpire3.setBackground(Color.black);
            Umpire3.setOpaque(true);
            Umpire3.setBorder(BorderFactory.createLineBorder(Color.white));
            Umpire3.setForeground(Color.white);
            Umpire3.setVisible(false);
            totalGUI.add(Umpire3);

            Umpire4.setLocation(1155, 495);
            Umpire4.setSize(85, 55);
            Umpire4.setHorizontalAlignment(0);
            Umpire4.setFont(new Font("Arial",Font.BOLD,20));
            Umpire4.setBackground(Color.black);
            Umpire4.setOpaque(true);
            Umpire4.setBorder(BorderFactory.createLineBorder(Color.white));
            Umpire4.setForeground(Color.white);
            Umpire4.setVisible(false);
            totalGUI.add(Umpire4);

// номер раунда
            round.setLocation(10, 10);
            round.setSize(370, 70);
            round.setHorizontalAlignment(2);
            round.setFont(new Font("Arial",Font.BOLD,60));
            round.setBackground(Color.black);
            round.setOpaque(true);
            round.setForeground(Color.white);
            totalGUI.add(round);

            //  судья 1


            rs1.setLocation(670, 565);
            rs1.setSize(150, 60);
            rs1.setHorizontalAlignment(0);
            rs1.setFont(new Font("Arial",Font.BOLD,60));
            rs1.setForeground(Color.white);
            rs1.setBackground(Color.red);
            rs1.setOpaque(true);
rs1.setVisible(false);
            totalGUI.add(rs1);

            bs1.setLocation(670, 630);
            bs1.setSize(150, 60);
            bs1.setHorizontalAlignment(0);
            bs1.setForeground(Color.white);
            bs1.setBackground(Color.blue);
            bs1.setFont(new Font("Arial",Font.BOLD,60));
            bs1.setOpaque(true);
            bs1.setVisible(false);

            totalGUI.add(bs1);

            //  судья 2

            rs2.setLocation(820, 565);
            rs2.setSize(150, 60);
            rs2.setHorizontalAlignment(0);
            rs2.setForeground(Color.white);
            rs2.setBackground(Color.red);
            rs2.setFont(new Font("Arial",Font.BOLD,60));
            rs2.setOpaque(true);
            rs2.setVisible(false);


            totalGUI.add(rs2);

            bs2.setLocation(820, 630);
            bs2.setSize(150, 60);
            bs2.setHorizontalAlignment(0);
            bs2.setForeground(Color.white);
            bs2.setBackground(Color.blue);
            bs2.setFont(new Font("Arial",Font.BOLD,60));
            bs2.setOpaque(true);
            bs2.setVisible(false);

            totalGUI.add(bs2);


            //судья 3
            rs3.setLocation(970, 565);
            rs3.setSize(150, 60);
            rs3.setHorizontalAlignment(0);
            rs3.setForeground(Color.white);
            rs3.setBackground(Color.red);
            rs3.setFont(new Font("Arial",Font.BOLD,60));
            rs3.setOpaque(true);
            rs3.setVisible(false);


            totalGUI.add(rs3);

            bs3.setLocation(970, 630);
            bs3.setSize(150, 60);
            bs3.setHorizontalAlignment(0);
            bs3.setForeground(Color.white);
            bs3.setBackground(Color.blue);
            bs3.setFont(new Font("Arial",Font.BOLD,60));
            bs3.setOpaque(true);
            bs3.setVisible(false);

            totalGUI.add(bs3);
            // судья 4

            rs4.setLocation(1120, 565);
            rs4.setSize(150, 60);
            rs4.setHorizontalAlignment(0);
            rs4.setForeground(Color.white);
            rs4.setBackground(Color.red);
            rs4.setFont(new Font("Arial",Font.BOLD,60));
            rs4.setOpaque(true);
            rs4.setVisible(false);


            totalGUI.add(rs4);

            bs4.setLocation(1120, 630);
            bs4.setSize(150, 60);
            bs4.setHorizontalAlignment(0);
            bs4.setForeground(Color.white);
            bs4.setBackground(Color.blue);
            bs4.setFont(new Font("Arial",Font.BOLD,60));
            bs4.setOpaque(true);
            bs4.setVisible(false);

            totalGUI.add(bs4);


            //участники 1 и 2
            rcompetitor.setLocation(160, 565);
            rcompetitor.setSize(510, 60);
            rcompetitor.setHorizontalAlignment(0);
            rcompetitor.setForeground(Color.white);
            rcompetitor.setBackground(Color.red);
            rcompetitor.setFont(new Font("Arial",Font.BOLD,40));
            rcompetitor.setOpaque(true);
            rcompetitor.setVisible(false);

            totalGUI.add(rcompetitor);

            bcompetitor.setLocation(160, 630);
            bcompetitor.setSize(510, 60);
            bcompetitor.setHorizontalAlignment(0);
            bcompetitor.setForeground(Color.white);
            bcompetitor.setBackground(Color.blue);
            bcompetitor.setFont(new Font("Arial",Font.BOLD,40));
            bcompetitor.setOpaque(true);
            bcompetitor.setVisible(false);

            totalGUI.add(bcompetitor);




            // общие очки
            btotal.setLocation(175, 150);
            btotal.setSize(450, 450);
            btotal.setHorizontalAlignment(0);
            btotal.setFont(new Font("Arial",Font.BOLD,370));
            btotal.setForeground(Color.white);
            btotal.setBackground(Color.blue);
            btotal.setBorder(BorderFactory.createLineBorder(Color.white,3));
            btotal.setOpaque(true);

            totalGUI.add(btotal);
            rtotal.setLocation(625, 150);
            rtotal.setSize(450, 450);
            rtotal.setHorizontalAlignment(0);
            rtotal.setForeground(Color.white);
            rtotal.setBackground(Color.red);
            rtotal.setFont(new Font("Arial",Font.BOLD,370));
            rtotal.setBorder(BorderFactory.createLineBorder(Color.white,3));
            rtotal.setOpaque(true);
            totalGUI.add(rtotal);
// штрафы

            rpenalty.setLocation(1072, 150);
            rpenalty.setSize(163, 225);
            rpenalty.setHorizontalAlignment(0);
            rpenalty.setBackground(Color.yellow);
            rpenalty.setOpaque(true);
            rpenalty.setBorder(BorderFactory.createLineBorder(Color.white,3));
            rpenalty.setFont(new Font("Arial",Font.BOLD,130));

            totalGUI.add(rpenalty);



            bpenalty.setLocation(15, 150);
            bpenalty.setSize(163, 225);
            bpenalty.setHorizontalAlignment(0);
            bpenalty.setBackground(Color.yellow);
            bpenalty.setOpaque(true);
            bpenalty.setBorder(BorderFactory.createLineBorder(Color.white,3));
            bpenalty.setFont(new Font("Arial",Font.BOLD,130));
            totalGUI.add(bpenalty);

//  предупреждения

            rwarnings.setLocation(1072, 372);
            rwarnings.setSize(163, 228);
            rwarnings.setHorizontalAlignment(0);
            rwarnings.setForeground(Color.black);
            rwarnings.setBackground(Color.LIGHT_GRAY);
            rwarnings.setOpaque(true);
            rwarnings.setBorder(BorderFactory.createLineBorder(Color.white,3));
            rwarnings.setFont(new Font("Arial",Font.BOLD,130));

            totalGUI.add(rwarnings);


            bwarnings.setLocation(15, 372);
            bwarnings.setSize(163, 228);
            bwarnings.setHorizontalAlignment(0);
            bwarnings.setForeground(Color.black);
            bwarnings.setBackground(Color.lightGray);
            bwarnings.setOpaque(true);
            bwarnings.setFont(new Font("Arial",Font.BOLD,130));
            bwarnings.setBorder(BorderFactory.createLineBorder(Color.white,3));
            totalGUI.add(bwarnings);

//  зачеты

            kickred1.setLocation(830, 360);
            kickred1.setSize(50, 50);
            kickred1.setHorizontalAlignment(0);
            kickred1.setBackground(Color.red);
            kickred1.setBorder(BorderFactory.createLineBorder(Color.white,2));
            kickred1.setVisible(false);
            kickred1.setOpaque(true);


            totalGUI.add(kickred1);

            kickred2.setLocation(830, 420);
            kickred2.setSize(50, 50);
            kickred2.setHorizontalAlignment(0);
            kickred2.setBackground(Color.red);
            kickred2.setBorder(BorderFactory.createLineBorder(Color.white,2));
            kickred2.setVisible(false);
            kickred2.setOpaque(true);


            totalGUI.add(kickred2);

            //  судья 2

            kickblue1.setLocation(400, 360);
            kickblue1.setSize(50, 50);
            kickblue1.setHorizontalAlignment(0);
            kickblue1.setBackground(Color.red);
            kickblue1.setBorder(BorderFactory.createLineBorder(Color.white,2));
            kickblue1.setVisible(false);
            kickblue1.setOpaque(true);


            totalGUI.add(kickblue1);

            kickblue2.setLocation(400, 420);
            kickblue2.setSize(50, 50);
            kickblue2.setHorizontalAlignment(0);
            kickblue2.setBackground(Color.red);
            kickblue2.setBorder(BorderFactory.createLineBorder(Color.white,2));
            kickblue2.setVisible(false);
            kickblue2.setOpaque(true);


            totalGUI.add(kickblue2);

            nlblrnd1.setLocation(560, 360);
            nlblrnd1.setSize(160, 50);
            nlblrnd1.setHorizontalAlignment(0);
            nlblrnd1.setFont(new Font("Arial",Font.BOLD,40));
            nlblrnd1.setForeground(Color.white);
            nlblrnd1.setBackground(Color.black);
            nlblrnd1.setVisible(false);
            nlblrnd1.setOpaque(true);


            totalGUI.add(nlblrnd1);

            nlblrnd2.setLocation(560, 420);
            nlblrnd2.setSize(160, 50);
            nlblrnd2.setHorizontalAlignment(0);
            nlblrnd2.setVisible(false);
            nlblrnd2.setFont(new Font("Arial",Font.BOLD,40));
            nlblrnd2.setForeground(Color.white);
            nlblrnd2.setBackground(Color.black);
            nlblrnd2.setOpaque(true);


            totalGUI.add(nlblrnd2);

            totalGUI.setOpaque(true);


            return totalGUI;





        }

    }






