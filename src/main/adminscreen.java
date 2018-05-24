package main;

import additional.*;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static main.mainform.btm;
import static main.mainform.frame3;
import static main.mainscreen.*;

/**
 * Created by Daha on 24.04.2017.
 */
//import static additional.TimerListener.brkcount;


    /**
     * Created by Andrew on 24.02.2017.
     */


    public class adminscreen {
        public static int screen=1;
        public static String img_flag = "EST";

        public static ImageIcon img = new ImageIcon("flags/"+img_flag+".png");
        // public static ImageIcon img = new ImageIcon("flags/"+img_flag+".png");

        public static JLabel boxUmpire12 = new JLabel("");
        public static JLabel boxUmpire22 = new JLabel("");
        public static JLabel boxUmpire32 = new JLabel("");
        public static JLabel boxUmpire42 = new JLabel("");

        public static JList umpirelistf = new JList();
        public static JComboBox boxUmpire1 = new JComboBox();

        public static JComboBox boxUmpire2 = new JComboBox();

        public static JComboBox boxUmpire3 = new JComboBox();

        public static JComboBox boxUmpire4 = new JComboBox();

        public static JTextField lblUmpire1 = new JTextField("Type Here!");
        //   public static String[] ump1 = new String[5];
      //  public static JLabel con = new JLabel("");

        public static JTextField lblcategory1 = new JTextField("ADULT MALE -64kg.");
        public static JLabel category = new JLabel("CATEGORY: ");
        public static int brk = 0;
        public static int tmaxround = 1;  // количество раундов в  поединке
        public static int tmaxmin = 0;  // количество минут в раунде
        public static int tmaxsec = 0;  // количество секунд в раунде
        public static int brkcount = 0; // время перерыва
        public static int min = 0;
        public static int rglobal = 0;
        public static int bglobal = 0;
        public static int rglobal1 = 0;
        public static int bglobal1 = 0;
        public static int rglobal2 = 0;
        public static int bglobal2 = 0;
        public static int rglobal3 = 0;
        public static int bglobal3 = 0;
        public static int rglobal4 = 0;
        public static int bglobal4 = 0;
        public static int count = 0;
        public static int amount = 0;
        public static int amountb = 0;
        public static int ar;
        public static int ab;
        public static int amount2 = 0;
        public static int amountb2 = 0;
        public static int ar2;
        public static int ab2;
        public static int amount3 = 0;
        public static int amountb3 = 0;
        public static int ar3;
        public static int ab3;
        public static int amount4 = 0;
        public static int amountb4 = 0;
        public static int ar4;
        public static int ab4;
        public static int rndnum = 1;
        public static int startstop = 2;
        public static int brktime=0;
        public static int br;
        public static int rwarning = 0;
        public static int bwarning = 0;
        public static int wr;
        public static int wb;
        public static JLabel rwarnings1 = new JLabel("0");
        public static JLabel bwarnings1 = new JLabel("0");

        // public static  String red281 = red28.getText();
        public static JLabel btotal1 = new JLabel("0");
        public static JLabel rtotal1 = new JLabel("0");
        public static JLabel rpenalty11 = new JLabel("");
        public static JLabel bpenalty11 = new JLabel("");
        public static int rpen = 0;
        public static int bpen = 0;
        public static int rpenal;
        public static int bpenal;
        public static JTextField rcompetitor1 = new JTextField("Red");

        public static JTextField bcompetitor1 = new JTextField("Blue");
        public static JLabel rs11 = new JLabel("0");
        public static JLabel bs11 = new JLabel("0");
        public static JLabel rs22 = new JLabel("0");
        public static JLabel bs22 = new JLabel("0");
        public static JLabel rs33 = new JLabel("0");
        public static JLabel bs33 = new JLabel("0");
        public static JLabel rs44 = new JLabel("0");
        public static JLabel bs44 = new JLabel("0");
        public static JLabel lbltimer = new JLabel("00:00");
        public static JLabel roundstop = new JLabel("Rounds");
        public static JLabel minutestop = new JLabel("Minutes");
        public static JLabel secondsstop = new JLabel("Seconds");
        public static JLabel breeaktop = new JLabel("Break");
        public static JLabel timmaxround = new JLabel(tmaxround + "");
        public static JLabel timmaxmin = new JLabel("");
        public static JLabel timmaxsec = new JLabel("");
        public static JLabel timbreaktime = new JLabel();
        public static JButton btnlog = new JButton("Show log");

        public static JLabel round1 = new JLabel(rndnum + "");
        public static Timer timer;
        public static JButton btnplusmaxrnd = new JButton("+");
        public static JButton btnminusmaxrnd = new JButton("-");
        public static JButton btnplusmaxmin = new JButton("+");
        public static JButton btnminusmaxmin = new JButton("-");
        public static JButton btnplusmaxsec = new JButton("+");
        public static JButton btnminusmaxsec = new JButton("-");
        public static JButton btnplusbrk = new JButton("+");
        public static JButton btnminusbrk = new JButton("-");
        public static JButton ekran1 = new JButton("1920*1080");
        public static JCheckBox bbelts = new JCheckBox();
        private static JLabel lblbbelts = new JLabel("Black Belts");
        //gamepad
        public static JButton btnWatch = new JButton("START");
        public static JLabel lblkicks = new JLabel("Compulsory techniques ");
        public static JLabel lblrnd1 = new JLabel("1Round ");
        public static JLabel lblrnd2 = new JLabel("2Round ");
        public static JCheckBox rnd1red = new JCheckBox();
        public static JCheckBox rnd2red = new JCheckBox();
        public static JCheckBox rnd1blue = new JCheckBox();
        public static JCheckBox rnd2blue = new JCheckBox();
        public static JButton theme = new JButton("Black");
        public static JComboBox boxcountry = new JComboBox();
        public static JLabel lblcountry = new JLabel("EST");

        public static String[][] ump = new String[20][3];
        public static int countUmire = 0;
        public static int rowarray = 0;
        public static int matchno1 = 1;
        public static JButton btnplusmatch = new JButton("+");
        public static JButton btnminusmatch = new JButton("-");
        public static  JLabel leader2 = new JLabel("DRAW");

        public static JLabel lblMatchNo1 = new JLabel(matchno1 + "");
        DefaultComboBoxModel  dm= new DefaultComboBoxModel();
        DefaultComboBoxModel dm2= new DefaultComboBoxModel();
        DefaultComboBoxModel dm3= new DefaultComboBoxModel();
        DefaultComboBoxModel dm4= new DefaultComboBoxModel();


        public JPanel createContentPane() {




            JPanel totalGUI = new JPanel();
            totalGUI.setLayout(null);
         img = new ImageIcon(new ImageIcon("flags/"+img_flag+".png").getImage().getScaledInstance(90,90, Image.SCALE_DEFAULT));

//JLabel lblMatchNo1  = new JLabel(matchno+"");
            lblMatchNo1.setLocation(50, 630);
            lblMatchNo1.setSize(100, 110);
            lblMatchNo1.setHorizontalAlignment(0);
            lblMatchNo1.setForeground(Color.black);
            //  lblMatchNo1.setVerticalAlignment(0);
            lblMatchNo1.setFont(new Font("Arial", Font.BOLD, 45));
            lblMatchNo1.setBorder(BorderFactory.createLineBorder(Color.black, 2));

            // timer.setBackground(Color.yellow);
            lblMatchNo1.setOpaque(true);
            totalGUI.add(lblMatchNo1);



            leader2.setLocation(475, 520);
            leader2.setSize(150, 50);
            leader2.setHorizontalAlignment(0);
            leader2.setBackground(Color.white);
            leader2.setOpaque(true);
            leader2.setBorder(BorderFactory.createLineBorder(Color.black,1));
            leader2.setForeground(Color.black);
            leader2.setFont(new Font("Arial",Font.BOLD,20));
            totalGUI.add(leader2);

            JLabel freeware = new JLabel("Secondary screen resolution must be 1280x720                                             This program is distributed free of charge!                                         (C) Andrei Jestin  jestin.andrei@gmail.com   ");
            freeware.setLocation(10, 750);
            freeware.setSize(1250, 15);
            freeware.setHorizontalAlignment(0);
            //freeware.setBackground(Color.white);
            freeware.setOpaque(true);
            freeware.setForeground(Color.black);
            freeware.setFont(new Font("Arial",Font.ITALIC,15));
            totalGUI.add(freeware);

// кнопка прибавления номера боя
//JButton btnplusmatch = new JButton("+");
            btnplusmatch.setLocation(10, 630);
            btnplusmatch.setSize(40, 55);

            btnplusmatch.setFont(new Font("Arial", Font.BOLD, 25));
            btnplusmatch.setBorder(BorderFactory.createLineBorder(Color.black));
            // btnplusmaxrnd.setBackground(Color.red);
            btnplusmatch.addActionListener(new maxmatch());
            btnplusmatch.setVisible(true);
            totalGUI.add(btnplusmatch);

//  кнопка вычитания номера боя
            //   JButton btnminusmatch = new JButton("-");
            btnminusmatch.setLocation(10, 685);
            btnminusmatch.setSize(40, 55);

            btnminusmatch.setFont(new Font("Arial", Font.BOLD, 25));
            btnminusmatch.setBorder(BorderFactory.createLineBorder(Color.black));
            // btnminusmaxrnd.setBackground(Color.red);
            btnminusmatch.addActionListener(new maxmatch());
            btnminusmatch.setVisible(true);
            totalGUI.add(btnminusmatch);

// выбор страны
            boxcountry.setSize(75, 30);
            boxcountry.setLocation(170, 200);
            boxcountry.addItem("Albania");
            boxcountry.addItem("Argentina");
            boxcountry.addItem("Armenia");
            boxcountry.addItem("Australia");
            boxcountry.addItem("Austria");
            boxcountry.addItem("Azerbaijan");
            boxcountry.addItem("Belarus");
            boxcountry.addItem("Belgium");
            boxcountry.addItem("Bosnia-and-Herzegovina");
            boxcountry.addItem("Bulgaria");
            boxcountry.addItem("Canada");
            boxcountry.addItem("Chile");
            boxcountry.addItem("China");
            boxcountry.addItem("Colombia");
            boxcountry.addItem("Costa-Rica");
            boxcountry.addItem("Croatia");
            boxcountry.addItem("Cuba");
            boxcountry.addItem("Cyprus");
            boxcountry.addItem("Czech-Republic");
            boxcountry.addItem("Denmark");
            boxcountry.addItem("England");
            boxcountry.addItem("Estonia");
            boxcountry.addItem("Finland");
            boxcountry.addItem("France");
            boxcountry.addItem("Georgia");
            boxcountry.addItem("Germany");
            boxcountry.addItem("Greece");
            boxcountry.addItem("Greenland");
            boxcountry.addItem("Hungary");
            boxcountry.addItem("Iceland");
            boxcountry.addItem("India");
            boxcountry.addItem("Ireland");
            boxcountry.addItem("Israel");
            boxcountry.addItem("Italy");
            boxcountry.addItem("Japan");
            boxcountry.addItem("Kazakhstan");
            boxcountry.addItem("Kyrgyzstan");
            boxcountry.addItem("Latvia");
            boxcountry.addItem("Lithuania");
            boxcountry.addItem("Macedonia");
            boxcountry.addItem("Mexico");
            boxcountry.addItem("Moldova");
            boxcountry.addItem("Nepal");
            boxcountry.addItem("Netherlands");
            boxcountry.addItem("North-Korea");
            boxcountry.addItem("Norway");
            boxcountry.addItem("Poland");
            boxcountry.addItem("Portugal");
            boxcountry.addItem("Puerto-Rico");
            boxcountry.addItem("Romania");
            boxcountry.addItem("Russia");
            boxcountry.addItem("Slovakia");
            boxcountry.addItem("Slovenia");
            boxcountry.addItem("Spain");
            boxcountry.addItem("Sweden");
            boxcountry.addItem("Switzerland");
            boxcountry.addItem("Tajikistan");
            boxcountry.addItem("Turkey");
            boxcountry.addItem("Turkmenistan");
            boxcountry.addItem("Ukraine");
            boxcountry.addItem("United-Kingdom");
            boxcountry.addItem("USA");
            boxcountry.addItem("Uzbekistan");
            boxcountry.addItem("Wales");







            boxcountry.setFont(new Font("Arial", Font.BOLD, 12));


            boxcountry.setEditable(true);
            boxcountry.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    lblcountry.setText(boxcountry.getSelectedItem().toString());

                    if (screen==1) {

                        ImageIcon img = new ImageIcon(new ImageIcon("flags/"+img_flag+".png").getImage().getScaledInstance(90, 90, Image.SCALE_DEFAULT));
                        Umpire1.setIcon(img);
                        Umpire2.setIcon(img);
                        Umpire3.setIcon(img);
                        Umpire4.setIcon(img);
                   }


                    if   (screen==2)
                    {


                       ImageIcon img = new ImageIcon(new ImageIcon("flags/"+img_flag+".png").getImage().getScaledInstance(110, 110, Image.SCALE_DEFAULT));
                        Umpire1.setIcon(img);
                        Umpire2.setIcon(img);
                        Umpire3.setIcon(img);
                        Umpire4.setIcon(img);}

                }
            });
            totalGUI.add(boxcountry);


            boxUmpire1.setSize(150, 30);
            boxUmpire1.setLocation(500, 600);
            boxUmpire1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    boxUmpire12.setText(boxUmpire1.getSelectedItem().toString());
                    int r=0;
                    while (!boxUmpire12.getText().equals(ump[r][0] +"   "+ ump[r][1])){
                        r++;
                    }
                    if   (screen==2)
                    {
                        img_flag = ump[r][1];

                      ImageIcon img = new ImageIcon(new ImageIcon("flags/"+img_flag+".png").getImage().getScaledInstance(110, 110, Image.SCALE_DEFAULT));
                        Umpire1.setIcon(img);

                    }
                    if   (screen==1)
                    {
                        img_flag = ump[r][1];
                        ImageIcon img = new ImageIcon(new ImageIcon("flags/"+img_flag+".png").getImage().getScaledInstance(90, 90, Image.SCALE_DEFAULT));
                        Umpire1.setIcon(img);


                    }


                }

            });
            boxUmpire1.setForeground(Color.black);
            // boxUmpire1.setFont(new Font("Arial", Font.BOLD, 30));
            boxUmpire1.setOpaque(true);


            totalGUI.add(boxUmpire1);


            boxUmpire2.setSize(150, 30);
            boxUmpire2.setLocation(650, 600);
            boxUmpire2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    boxUmpire22.setText(boxUmpire2.getSelectedItem().toString());

                    int r=0;
                    while (!boxUmpire22.getText().equals(ump[r][0] +"   "+ ump[r][1])){
                        r++;
                    }
                    if   (screen==2)
                    {
                        img_flag = ump[r][1];
                        ImageIcon img = new ImageIcon(new ImageIcon("flags/"+img_flag+".png").getImage().getScaledInstance(110, 110, Image.SCALE_DEFAULT));
                        Umpire2.setIcon(img);

                    }
                    if   (screen==1)
                    {
                        img_flag = ump[r][1];
                        ImageIcon img = new ImageIcon(new ImageIcon("flags/"+img_flag+".png").getImage().getScaledInstance(90, 90, Image.SCALE_DEFAULT));
                        Umpire2.setIcon(img);

                    }
                }

            });
            totalGUI.add(boxUmpire2);


            boxUmpire3.setSize(150, 30);
            boxUmpire3.setLocation(800, 600);
            boxUmpire3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    boxUmpire32.setText(boxUmpire3.getSelectedItem().toString());
                    int r=0;
                    while (!boxUmpire32.getText().equals(ump[r][0] +"   "+ ump[r][1])){
                        r++;
                    }
                    if   (screen==2)
                    {
                        img_flag = ump[r][1];
                        ImageIcon img = new ImageIcon(new ImageIcon("flags/"+img_flag+".png").getImage().getScaledInstance(110, 110, Image.SCALE_DEFAULT));
                        Umpire3.setIcon(img);
                    }
                    if   (screen==1)
                    {
                        img_flag = ump[r][1];
                        ImageIcon img = new ImageIcon(new ImageIcon("flags/"+img_flag+".png").getImage().getScaledInstance(90, 90, Image.SCALE_DEFAULT));
                        Umpire3.setIcon(img);

                    }
                }

            });

            totalGUI.add(boxUmpire3);

            boxUmpire4.setSize(150, 30);
            boxUmpire4.setLocation(950, 600);
            boxUmpire4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {

                    boxUmpire42.setText(boxUmpire4.getSelectedItem().toString());
                    int r=0;
                    while (!boxUmpire42.getText().equals(ump[r][0] +"   "+ ump[r][1])){
                        r++;
                    }

                    if   (screen==2)
                    {
                        img_flag = ump[r][1];
                       img = new ImageIcon(new ImageIcon("flags/"+img_flag+".png").getImage().getScaledInstance(110, 110, Image.SCALE_DEFAULT));
                        Umpire4.setIcon(img);
                    }
                    if   (screen==1)
                    {
                        img_flag = ump[r][1];
                       img = new ImageIcon(new ImageIcon("flags/"+img_flag+".png").getImage().getScaledInstance(90, 90, Image.SCALE_DEFAULT));
                        Umpire4.setIcon(img);

                    }
                }

            });

            totalGUI.add(boxUmpire4);


            // красный зачёт 1

            rnd1red.setLocation(470, 115);
            rnd1red.setSize(30, 30);
            rnd1red.setForeground(Color.black);
            rnd1red.setVisible(false);
            rnd1red.addActionListener(new bbcheck1());
            totalGUI.add(rnd1red);

            // красный  зачёт 2

            rnd2red.setLocation(470, 145);
            rnd2red.setSize(30, 30);
            rnd2red.setForeground(Color.black);
            rnd2red.setVisible(false);
            totalGUI.add(rnd2red);
            rnd2red.addActionListener(new bbcheck2());
            // синий зачёт 1

            rnd1blue.setLocation(600, 115);
            rnd1blue.setSize(30, 30);
            rnd1blue.setForeground(Color.black);
            rnd1blue.setVisible(false);
            rnd1blue.addActionListener(new bbcheck3());
            totalGUI.add(rnd1blue);

            // синий зачёт 2

            rnd2blue.setLocation(600, 145);
            rnd2blue.setSize(30, 30);
            rnd2blue.setForeground(Color.black);
            rnd2blue.setVisible(false);
            rnd2blue.addActionListener(new bbcheck4());
            totalGUI.add(rnd2blue);
            // 2rnd надпись
            lblrnd2.setLocation(510, 150);
            lblrnd2.setSize(80, 20);
            lblrnd2.setForeground(Color.black);
            lblrnd2.setFont(new Font("Arial", Font.BOLD, 20));
            lblrnd2.setVisible(false);
            totalGUI.add(lblrnd2);
            // 1rnd надпись
            lblrnd1.setLocation(510, 120);
            lblrnd1.setSize(80, 20);
            lblrnd1.setForeground(Color.black);
            lblrnd1.setFont(new Font("Arial", Font.BOLD, 20));
            lblrnd1.setVisible(false);
            totalGUI.add(lblrnd1);

//  черные пояса надпись 2
            lblkicks.setLocation(440, 90);
            lblkicks.setSize(250, 20);
            lblkicks.setForeground(Color.black);
            lblkicks.setFont(new Font("Arial", Font.BOLD, 20));
            lblkicks.setVisible(false);
            totalGUI.add(lblkicks);

            // черные пояса надпись
            lblbbelts.setLocation(20, 25);
            lblbbelts.setSize(150, 20);
            lblbbelts.setForeground(Color.black);
            lblbbelts.setFont(new Font("Arial", Font.BOLD, 20));
            lblbbelts.setVisible(true);
            totalGUI.add(lblbbelts);


            // черные пояса

            bbelts.setLocation(150, 10);
            bbelts.setSize(50, 50);
            bbelts.setForeground(Color.black);
            bbelts.setVisible(true);
            bbelts.addActionListener(new bbcheck());
            totalGUI.add(bbelts);

//lbl category
            category.setLocation(250, 20);
            category.setSize(150, 50);
            category.setHorizontalAlignment(0);
            category.setForeground(Color.black);
            category.setFont(new Font("Arial", Font.BOLD, 20));
            // lblcategory.setBorder(BorderFactory.createLineBorder(Color.black));
            category.setOpaque(true);

            totalGUI.add(category);


            lblcategory1.setLocation(400, 20);
            lblcategory1.setSize(450, 50);
            lblcategory1.setHorizontalAlignment(0);
            lblcategory1.setForeground(Color.black);
            lblcategory1.setFont(new Font("Arial", Font.BOLD, 25));
            // lblcategory.setBorder(BorderFactory.createLineBorder(Color.black));
            lblcategory1.setOpaque(true);
            lblcategory1.getDocument().addDocumentListener(new DocumentListener() {
                public void removeUpdate(DocumentEvent e) {
                    System.out.println("removeUpdate");
                    lblcategory.setText("Sparring");
                }

                public void insertUpdate(DocumentEvent e) {
                    System.out.println("insertUpdate");
                    lblcategory.setText(lblcategory1.getText());
                }

                public void changedUpdate(DocumentEvent e) {
                    System.out.println("changedUpdate");
                    lblcategory.setText(lblcategory1.getText());
                }
            });
            totalGUI.add(lblcategory1);

            // кнопка прибавления секунд

            btnplusmaxsec.setLocation(1100, 200);
            btnplusmaxsec.setSize(40, 40);

            btnplusmaxsec.setFont(new Font("Arial", Font.BOLD, 25));
            btnplusmaxsec.setBorder(BorderFactory.createLineBorder(Color.black));
            btnplusmaxsec.addActionListener(new maxsec());
            btnplusmaxsec.setVisible(true);
            totalGUI.add(btnplusmaxsec);

//  кнопка вычитания секунд

            btnminusmaxsec.setLocation(1100, 280);
            btnminusmaxsec.setSize(40, 40);
            btnminusmaxsec.setFont(new Font("Arial", Font.BOLD, 25));
            btnminusmaxsec.setBorder(BorderFactory.createLineBorder(Color.black));
            btnminusmaxsec.addActionListener(new maxsec());
            btnminusmaxsec.setVisible(true);
            totalGUI.add(btnminusmaxsec);

// кнопка прибавления раундов

            btnplusmaxrnd.setLocation(900, 200);
            btnplusmaxrnd.setSize(40, 40);
            btnplusmaxrnd.setFont(new Font("Arial", Font.BOLD, 25));
            btnplusmaxrnd.setBorder(BorderFactory.createLineBorder(Color.black));
            btnplusmaxrnd.addActionListener(new maxrnd());
            btnplusmaxrnd.setVisible(true);
            totalGUI.add(btnplusmaxrnd);

//  кнопка вычитания раундов

            btnminusmaxrnd.setLocation(900, 280);
            btnminusmaxrnd.setSize(40, 40);
            btnminusmaxrnd.setFont(new Font("Arial", Font.BOLD, 25));
            btnminusmaxrnd.setBorder(BorderFactory.createLineBorder(Color.black));
            btnminusmaxrnd.addActionListener(new maxrnd());
            btnminusmaxrnd.setVisible(true);
            totalGUI.add(btnminusmaxrnd);

// кнопка прибавления минут

            btnplusmaxmin.setLocation(1000, 200);
            btnplusmaxmin.setSize(40, 40);
            btnplusmaxmin.setFont(new Font("Arial", Font.BOLD, 25));
            btnplusmaxmin.setBorder(BorderFactory.createLineBorder(Color.black));
            btnplusmaxmin.addActionListener(new maxmin());
            btnplusmaxmin.setVisible(true);
            totalGUI.add(btnplusmaxmin);

//  кнопка вычитания минут

            btnminusmaxmin.setLocation(1000, 280);
            btnminusmaxmin.setSize(40, 40);
            btnminusmaxmin.setFont(new Font("Arial", Font.BOLD, 25));
            btnminusmaxmin.setBorder(BorderFactory.createLineBorder(Color.black));
            btnminusmaxmin.addActionListener(new maxmin());
            btnminusmaxmin.setVisible(true);
            totalGUI.add(btnminusmaxmin);

            // кнопка прибавления перерыва

            btnplusbrk.setLocation(1200, 200);
            btnplusbrk.setSize(40, 40);
            btnplusbrk.setFont(new Font("Arial", Font.BOLD, 25));
            btnplusbrk.setBorder(BorderFactory.createLineBorder(Color.black));
            btnplusbrk.addActionListener(new maxbrk());
            btnplusbrk.setVisible(true);
            totalGUI.add(btnplusbrk);

//  кнопка вычитания перерыва

            btnminusbrk.setLocation(1200, 280);
            btnminusbrk.setSize(40, 40);
            btnminusbrk.setFont(new Font("Arial", Font.BOLD, 25));
            btnminusbrk.setBorder(BorderFactory.createLineBorder(Color.black));
            btnminusbrk.addActionListener(new maxbrk());
            btnminusbrk.setVisible(true);
            totalGUI.add(btnminusbrk);

//  кол-во раундов в таймере
            timmaxround.setLocation(900, 240);
            timmaxround.setSize(40, 40);
            timmaxround.setHorizontalAlignment(0);
            timmaxround.setOpaque(true);
            timmaxround.setBorder(BorderFactory.createLineBorder(Color.black));
            timmaxround.setForeground(Color.black);
            timmaxround.setFont(new Font("Arial", Font.BOLD, 25));
            totalGUI.add(timmaxround);

//  кол-во минут в таймере
            timmaxmin.setLocation(1000, 240);
            timmaxmin.setSize(40, 40);
            timmaxmin.setHorizontalAlignment(0);
            timmaxmin.setOpaque(true);
            timmaxmin.setBorder(BorderFactory.createLineBorder(Color.black));
            timmaxmin.setForeground(Color.black);
            timmaxmin.setFont(new Font("Arial", Font.BOLD, 25));
            totalGUI.add(timmaxmin);
//  кол-во секунд в таймере
            timmaxsec.setLocation(1100, 240);
            timmaxsec.setSize(40, 40);
            timmaxsec.setHorizontalAlignment(0);
            timmaxsec.setOpaque(true);
            timmaxsec.setBorder(BorderFactory.createLineBorder(Color.black));
            timmaxsec.setForeground(Color.black);
            timmaxsec.setFont(new Font("Arial", Font.BOLD, 25));
            totalGUI.add(timmaxsec);
// продолжительность перерыва

            timbreaktime.setLocation(1200, 240);
            timbreaktime.setSize(40, 40);
            timbreaktime.setHorizontalAlignment(0);
            timbreaktime.setOpaque(true);
            timbreaktime.setBorder(BorderFactory.createLineBorder(Color.black));
            timbreaktime.setForeground(Color.black);
            timbreaktime.setFont(new Font("Arial", Font.BOLD, 25));
            totalGUI.add(timbreaktime);

// номер раунда
            round1.setLocation(910, 20);
            round1.setSize(70, 70);
            round1.setHorizontalAlignment(0);
            round1.setBackground(Color.yellow);
            round1.setOpaque(true);
            round1.setBorder(BorderFactory.createLineBorder(Color.black));
            round1.setForeground(Color.black);
            round1.setFont(new Font("Arial", Font.BOLD, 45));
            totalGUI.add(round1);

//      таймер

            lbltimer.setLocation(980, 20);
            lbltimer.setSize(220, 70);
            lbltimer.setHorizontalAlignment(0);
            lbltimer.setForeground(Color.black);
            lbltimer.setVerticalAlignment(0);
            lbltimer.setFont(new Font("Arial", Font.BOLD, 60));
            lbltimer.setBorder(BorderFactory.createLineBorder(Color.black));
            lbltimer.setOpaque(true);
            totalGUI.add(lbltimer);

            // табличка rounds

            roundstop.setLocation(870, 150);
            roundstop.setSize(100, 40);
            roundstop.setHorizontalAlignment(0);
            roundstop.setForeground(Color.black);
            roundstop.setVerticalAlignment(0);
            roundstop.setFont(new Font("Arial", Font.BOLD, 20));
            roundstop.setOpaque(true);
            totalGUI.add(roundstop);
            // табличка minutes

            minutestop.setLocation(970, 150);
            minutestop.setSize(100, 40);
            minutestop.setHorizontalAlignment(0);
            minutestop.setForeground(Color.black);
            minutestop.setVerticalAlignment(0);
            minutestop.setFont(new Font("Arial", Font.BOLD, 20));
            minutestop.setOpaque(true);
            totalGUI.add(minutestop);
            // табличка seconds
            secondsstop.setLocation(1070, 150);
            secondsstop.setSize(100, 40);
            secondsstop.setHorizontalAlignment(0);
            secondsstop.setForeground(Color.black);
            secondsstop.setVerticalAlignment(0);
            secondsstop.setFont(new Font("Arial", Font.BOLD, 20));
            secondsstop.setOpaque(true);
            totalGUI.add(secondsstop);
            // табличка Break
            breeaktop.setLocation(1170, 150);
            breeaktop.setSize(100, 40);
            breeaktop.setHorizontalAlignment(0);
            breeaktop.setForeground(Color.black);
            breeaktop.setVerticalAlignment(0);
            breeaktop.setFont(new Font("Arial", Font.BOLD, 20));
            breeaktop.setOpaque(true);
            totalGUI.add(breeaktop);

//  сброс
            JButton btnReset = new JButton("RESET");
            btnReset.setLocation(1100, 360);
            btnReset.setSize(120, 60);
            btnReset.setFont(new Font("Arial", Font.BOLD, 25));
            btnReset.setBorder(BorderFactory.createLineBorder(Color.black));
            btnReset.setBackground(Color.red);
            btnReset.addActionListener(new WatchButtonListener());
            btnReset.setVisible(true);
            totalGUI.add(btnReset);


//  старт таймера

            //JButton btnWatch = new JButton("Start");
            btnWatch.setLocation(900, 360);
            btnWatch.setSize(120, 60);
            btnWatch.setBackground(Color.green);
            btnWatch.setFont(new Font("Arial", Font.BOLD, 25));
            btnWatch.setBorder(BorderFactory.createLineBorder(Color.black));
            btnWatch.addActionListener((ActionListener) new WatchButtonListener());
            timer = new Timer(1000, new TimerListener());
            btnWatch.setVisible(true);
            totalGUI.add(btnWatch);

            // звуковой сигнал
            JButton btnSignal = new JButton("*Beep");
            btnSignal.setLocation(900, 440);
            btnSignal.setSize(120, 60);
            btnSignal.setFont(new Font("Arial", Font.BOLD, 25));
            btnSignal.setBorder(BorderFactory.createLineBorder(Color.black));
            btnSignal.addActionListener((ActionListener) new WatchButtonListener());
            btnSignal.setVisible(true);
            totalGUI.add(btnSignal);


// кнопка  цвета экрана

            theme.setLocation(20, 560);
            theme.setSize(80, 30);
            theme.setFont(new Font("Arial", Font.BOLD, 10));
            theme.setBorder(BorderFactory.createLineBorder(Color.black));
            theme.addActionListener(new themecolor());
            theme.setVisible(false);
            totalGUI.add(theme);
// кнопка экрана 1

            ekran1.setLocation(20, 520);
            ekran1.setSize(80, 30);
            ekran1.setFont(new Font("Arial", Font.BOLD, 10));
            ekran1.setBorder(BorderFactory.createLineBorder(Color.black));
            ekran1.addActionListener(new ekran1());
            ekran1.setVisible(false);
            totalGUI.add(ekran1);

            btnlog.setLocation(20, 540);
            btnlog.setSize(80, 30);
            btnlog.setFont(new Font("Arial", Font.BOLD, 10));
            btnlog.setBorder(BorderFactory.createLineBorder(Color.black));
            btnlog.addActionListener(new LogButtonListener());
            totalGUI.add(btnlog);

// штраф синий

            JButton penaltyplusblue = new JButton("+");
            penaltyplusblue.setLocation(750, 290);
            penaltyplusblue.setSize(50, 60);
            penaltyplusblue.setBackground(Color.yellow);
            penaltyplusblue.setForeground(Color.black);
            penaltyplusblue.setFont(new Font("Arial", Font.BOLD, 20));
            penaltyplusblue.setBorder(BorderFactory.createLineBorder(Color.black));
            penaltyplusblue.addActionListener(new penaltyblue());
            totalGUI.add(penaltyplusblue);

            JButton penaltyblueminus = new JButton("-");
            penaltyblueminus.setLocation(800, 290);
            penaltyblueminus.setSize(50, 60);
            penaltyblueminus.setBackground(Color.yellow);
            penaltyblueminus.setForeground(Color.black);
            penaltyblueminus.setFont(new Font("Arial", Font.BOLD, 20));
            penaltyblueminus.setBorder(BorderFactory.createLineBorder(Color.black));
            penaltyblueminus.addActionListener(new penaltyminusblue());
            totalGUI.add(penaltyblueminus);
//
//// штраф красный

            JButton penaltyplusred = new JButton("+");
            penaltyplusred.setLocation(250, 290);
            penaltyplusred.setSize(50, 60);
            penaltyplusred.setBackground(Color.yellow);
            penaltyplusred.setForeground(Color.black);
            penaltyplusred.setFont(new Font("Arial", Font.BOLD, 20));
            penaltyplusred.setBorder(BorderFactory.createLineBorder(Color.black));
            penaltyplusred.addActionListener(new penaltyred());
            totalGUI.add(penaltyplusred);

            JButton penaltyredminus = new JButton("-");
            penaltyredminus.setLocation(300, 290);
            penaltyredminus.setSize(50, 60);
            penaltyredminus.setBackground(Color.yellow);
            penaltyredminus.setForeground(Color.black);
            penaltyredminus.setBorder(BorderFactory.createLineBorder(Color.black));
            penaltyredminus.setFont(new Font("Arial", Font.BOLD, 20));
            penaltyredminus.addActionListener(new penaltyminusred());
            totalGUI.add(penaltyredminus);
            //предупреждения

            rwarnings1.setLocation(250, 350);
            rwarnings1.setSize(100, 150);
            rwarnings1.setHorizontalAlignment(0);
            rwarnings1.setForeground(Color.black);
            rwarnings1.setBorder(BorderFactory.createLineBorder(Color.black));
            rwarnings1.setVerticalAlignment(SwingConstants.TOP);
            rwarnings1.setFont(new Font("Arial", Font.BOLD, 75));
            totalGUI.add(rwarnings1);

            bwarnings1.setLocation(750, 350);
            bwarnings1.setSize(100, 150);
            bwarnings1.setHorizontalAlignment(0);
            bwarnings1.setVerticalAlignment(SwingConstants.TOP);
            bwarnings1.setForeground(Color.black);
            bwarnings1.setFont(new Font("Arial", Font.BOLD, 75));
            bwarnings1.setBorder(BorderFactory.createLineBorder(Color.black));
            totalGUI.add(bwarnings1);

            // штрафные очки
            rpenalty11.setLocation(250, 200);
            rpenalty11.setSize(100, 90);
            rpenalty11.setHorizontalAlignment(0);
            rpenalty11.setForeground(Color.black);
            rpenalty11.setVerticalAlignment(SwingConstants.BOTTOM);
            rpenalty11.setBorder(BorderFactory.createLineBorder(Color.black));
            rpenalty11.setFont(new Font("Arial", Font.BOLD, 75));
            rpenalty11.setBackground(Color.yellow);
            rpenalty11.setOpaque(true);
            totalGUI.add(rpenalty11);

            bpenalty11.setLocation(750, 200);
            bpenalty11.setSize(100, 90);
            bpenalty11.setHorizontalAlignment(0);
            bpenalty11.setForeground(Color.black);
            bpenalty11.setVerticalAlignment(SwingConstants.BOTTOM);
            bpenalty11.setFont(new Font("Arial", Font.BOLD, 75));
            bpenalty11.setBorder(BorderFactory.createLineBorder(Color.black));
            bpenalty11.setBackground(Color.yellow);
            bpenalty11.setOpaque(true);
            totalGUI.add(bpenalty11);

            // список судей (поле)
            umpirelistf.setLocation(20, 290);
            umpirelistf.setSize(200, 210);
            umpirelistf.setBorder(BorderFactory.createLineBorder(Color.black));
            totalGUI.add(umpirelistf);

//   button add umpire

            JButton addumpire = new JButton("ADD");
            addumpire.setLocation(20, 240);
            addumpire.setSize(80, 30);
            addumpire.setHorizontalAlignment(0);
            addumpire.addActionListener(new baddactionperformed());
            totalGUI.add(addumpire);

            //   button  delete umpire

            JButton delumpire = new JButton("DEL ALL");
            delumpire.setLocation(130, 240);
            delumpire.setSize(90, 30);
            delumpire.setHorizontalAlignment(2);
            delumpire.addActionListener(new bdelactionperformed());
            totalGUI.add(delumpire);

//  главная надпись Umpire List
            JLabel umpirelist = new JLabel("Umpire List");
            umpirelist.setLocation(20, 160);
            umpirelist.setSize(200, 30);
            umpirelist.setHorizontalAlignment(0);
            umpirelist.setOpaque(true);
            umpirelist.setForeground(Color.black);
            umpirelist.setFont(new Font("Arial", Font.BOLD, 20));
            totalGUI.add(umpirelist);

// номера судей

            lblUmpire1.setLocation(20, 200);
            lblUmpire1.setSize(140, 30);
            lblUmpire1.setHorizontalAlignment(0);
            lblUmpire1.setOpaque(true);
            lblUmpire1.setForeground(Color.black);
            totalGUI.add(lblUmpire1);


            // общие очки
            btotal1.setLocation(550, 200);
            btotal1.setSize(200, 300);
            btotal1.setHorizontalAlignment(0);
            btotal1.setForeground(Color.white);
            btotal1.setBackground(Color.blue);
            btotal1.setFont(new Font("Arial", Font.BOLD, 220));
            btotal1.setBorder(BorderFactory.createLineBorder(Color.black));
            btotal1.setOpaque(true);

            totalGUI.add(btotal1);
            rtotal1.setLocation(350, 200);
            rtotal1.setSize(200, 300);
            rtotal1.setHorizontalAlignment(0);
            rtotal1.setForeground(Color.white);
            rtotal1.setBackground(Color.red);
            rtotal1.setFont(new Font("Arial", Font.BOLD, 220));
            rtotal1.setBorder(BorderFactory.createLineBorder(Color.black));
            rtotal1.setOpaque(true);
            totalGUI.add(rtotal1);


// Сброс очков


            JButton resetButton = new JButton("RESET ALL");
            resetButton.setLocation(1120, 680);
            resetButton.setSize(120, 50);
            resetButton.setBackground(Color.white);
            resetButton.setForeground(Color.black);
            resetButton.addActionListener(new resetscore());
            totalGUI.add(resetButton);

            JButton btnnext = new JButton("NEXT");
            btnnext.setLocation(1120, 610);
            btnnext.setSize(120, 50);
            btnnext.setBackground(Color.white);
            btnnext.setForeground(Color.black);
            btnnext.addActionListener(new nextmatch());
            totalGUI.add(btnnext);


            // замечания синий

            JButton warningplusblue = new JButton("+");
            warningplusblue.setLocation(750, 440);
            warningplusblue.setSize(50, 60);
            warningplusblue.setBackground(Color.blue);
            warningplusblue.setForeground(Color.white);
            warningplusblue.setFont(new Font("Arial", Font.BOLD, 40));
            warningplusblue.addActionListener(new waringblue());
            warningplusblue.setBorder(BorderFactory.createLineBorder(Color.black));
            totalGUI.add(warningplusblue);


            JButton warningminusblue = new JButton("-");
            warningminusblue.setLocation(800, 440);
            warningminusblue.setSize(50, 60);
            warningminusblue.setBackground(Color.blue);
            warningminusblue.setForeground(Color.white);
            warningminusblue.setBorder(BorderFactory.createLineBorder(Color.black));

            warningminusblue.setFont(new Font("Arial", Font.BOLD, 40));
            warningminusblue.addActionListener(new warningblueminus());
            totalGUI.add(warningminusblue);

// замечания красный

            JButton warningplusred = new JButton("+");
            warningplusred.setLocation(250, 440);
            warningplusred.setSize(50, 60);
            warningplusred.setBackground(Color.red);
            warningplusred.setForeground(Color.white);
            warningplusred.setFont(new Font("Arial", Font.BOLD, 40));
            warningplusred.addActionListener(new warningred());
            warningplusred.setBorder(BorderFactory.createLineBorder(Color.black));
            totalGUI.add(warningplusred);


            JButton warningminusred = new JButton("-");
            warningminusred.setLocation(300, 440);
            warningminusred.setSize(50, 60);
            warningminusred.setBackground(Color.red);
            warningminusred.setForeground(Color.white);
            warningminusred.setBorder(BorderFactory.createLineBorder(Color.black));
            warningminusred.setFont(new Font("Arial", Font.BOLD, 40));


            warningminusred.addActionListener(new warningredminus());
            totalGUI.add(warningminusred);


            //участники 1 и 2

            rcompetitor1.setLocation(150, 630);
            rcompetitor1.setSize(350, 50);
            rcompetitor1.setHorizontalAlignment(0);
            rcompetitor1.setForeground(Color.white);
            rcompetitor1.setBackground(Color.red);
            rcompetitor1.setFont(new Font("Arial", Font.BOLD, 30));
            rcompetitor1.getDocument().addDocumentListener(new DocumentListener() {

                public void removeUpdate(DocumentEvent e) {
                    System.out.println("removeUpdate");
                    rcompetitor.setText("Red");
                }

                public void insertUpdate(DocumentEvent e) {
                    System.out.println("insertUpdate");
                    rcompetitor.setText(rcompetitor1.getText());
                }

                public void changedUpdate(DocumentEvent e) {
                    System.out.println("changedUpdate");
                    rcompetitor.setText(rcompetitor1.getText());
                }
            });
            rcompetitor1.setOpaque(true);

            totalGUI.add(rcompetitor1);

            bcompetitor1.setLocation(150, 690);
            bcompetitor1.setSize(350, 50);
            bcompetitor1.setHorizontalAlignment(0);
            bcompetitor1.setForeground(Color.white);
            bcompetitor1.setBackground(Color.blue);
            bcompetitor1.setFont(new Font("Arial", Font.BOLD, 30));
            bcompetitor1.setOpaque(true);
            bcompetitor1.getDocument().addDocumentListener(new DocumentListener() {

                public void removeUpdate(DocumentEvent e) {
                    System.out.println("removeUpdate");
                    bcompetitor.setText("Blue");
                }

                public void insertUpdate(DocumentEvent e) {
                    System.out.println("insertUpdate");
                    bcompetitor.setText(bcompetitor1.getText());
                }

                public void changedUpdate(DocumentEvent e) {
                    System.out.println("changedUpdate");
                    bcompetitor.setText(bcompetitor1.getText());
                }
            });
            totalGUI.add(bcompetitor1);
            //  судья 1


            rs11.setLocation(500, 630);
            rs11.setSize(150, 50);
            rs11.setHorizontalAlignment(0);
            rs11.setForeground(Color.white);
            rs11.setBackground(Color.red);
            rs11.setFont(new Font("Arial", Font.BOLD, 45));
            rs11.setOpaque(true);


            totalGUI.add(rs11);

            bs11.setLocation(500, 690);
            bs11.setSize(150, 50);
            bs11.setHorizontalAlignment(0);
            bs11.setForeground(Color.white);
            bs11.setBackground(Color.blue);
            bs11.setFont(new Font("Arial", Font.BOLD, 45));
            bs11.setOpaque(true);

            totalGUI.add(bs11);

            //  судья 2

            rs22.setLocation(650, 630);
            rs22.setSize(150, 50);
            rs22.setHorizontalAlignment(0);
            rs22.setForeground(Color.white);
            rs22.setBackground(Color.red);
            rs22.setFont(new Font("Arial", Font.BOLD, 45));
            rs22.setOpaque(true);


            totalGUI.add(rs22);

            bs22.setLocation(650, 690);
            bs22.setSize(150, 50);
            bs22.setHorizontalAlignment(0);
            bs22.setForeground(Color.white);
            bs22.setBackground(Color.blue);
            bs22.setFont(new Font("Arial", Font.BOLD, 45));
            bs22.setOpaque(true);

            totalGUI.add(bs22);


            //судья 3
            rs33.setLocation(800, 630);
            rs33.setSize(150, 50);
            rs33.setHorizontalAlignment(0);
            rs33.setForeground(Color.white);
            rs33.setBackground(Color.red);
            rs33.setFont(new Font("Arial", Font.BOLD, 45));
            rs33.setOpaque(true);


            totalGUI.add(rs33);

            bs33.setLocation(800, 690);
            bs33.setSize(150, 50);
            bs33.setHorizontalAlignment(0);
            bs33.setForeground(Color.white);
            bs33.setBackground(Color.blue);
            bs33.setFont(new Font("Arial", Font.BOLD, 45));
            bs33.setOpaque(true);

            totalGUI.add(bs33);
            // судья 4

            rs44.setLocation(950, 630);
            rs44.setSize(150, 50);
            rs44.setHorizontalAlignment(0);
            rs44.setForeground(Color.white);
            rs44.setBackground(Color.red);
            rs44.setFont(new Font("Arial", Font.BOLD, 45));
            rs44.setOpaque(true);


            totalGUI.add(rs44);

            bs44.setLocation(950, 690);
            bs44.setSize(150, 50);
            bs44.setHorizontalAlignment(0);
            bs44.setForeground(Color.white);
            bs44.setBackground(Color.blue);
            bs44.setFont(new Font("Arial", Font.BOLD, 45));
            bs44.setOpaque(true);

            totalGUI.add(bs44);


            return totalGUI;


        }


        private class WatchButtonListener implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                if (event.getActionCommand().equals("START")) {

                    min=tmaxmin;
                  count=tmaxsec;
                  brkcount=br;

                    btnWatch.setText("STOP");
                    btnWatch.setBackground(Color.yellow);
                    // btnReset.setEnabled(false);
                    sound.playSound("sounds/start2s.wav");
                    timer.start();


                    String[] str10 = new String[5];
                    str10[0] = "Jury President";
                    str10[1] = round.getText();
                    str10[2] = lbltimer.getText();
                    str10[3] = "Match No "+ matchno1 +" Starts!";
                    str10[4] = rcompetitor.getText()+" " +rtotal.getText()+":" + btotal.getText()+" "+ bcompetitor.getText();
                    btm.addDate(str10);
                    btm.fireTableDataChanged();

                } else if (event.getActionCommand().equals("RESUME")) {
                    btnWatch.setBackground(Color.yellow);
                    btnWatch.setText("STOP");
                    timer.start();

                } else if (event.getActionCommand().equals("*Beep")) {
                    sound.playSound("sounds/pip.wav").join();

                } else if (event.getActionCommand().equals("RESET")) {
                    count = 0;
                    min = 0;
                    brk = 0;
                    rndnum = 1;

                    lbltimer.setText("00:00");
                    lbltimer1.setText("00:00");
                    timer.stop();
                    btnWatch.setText("START");
                    btnWatch.setBackground(Color.green);

                } else {
                    timer.stop();
                    btnWatch.setText("RESUME");
                    btnWatch.setBackground(Color.green);
                }
            }
        }

        private class LogButtonListener implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                if (event.getActionCommand().equals("Show log")) {
                    frame3.setExtendedState(JFrame.NORMAL);
                    btnlog.setText("Hide log");


                } else if (event.getActionCommand().equals("Hide log")) {
                    frame3.setState(JFrame.ICONIFIED);
                    btnlog.setText("Show log");


                } else {

                }
            }
        }

        private class bbcheck implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (bbelts.isSelected()) {
                    lblkicks.setVisible(true);
                    //lblkicks2.setVisible(true);
                    rnd1blue.setVisible(true);
                    rnd2blue.setVisible(true);
                    rnd1red.setVisible(true);
                    rnd2red.setVisible(true);
                    lblrnd1.setVisible(true);
                    lblrnd2.setVisible(true);
                    kickred1.setVisible(true);
                    kickred2.setVisible(true);
                    kickblue1.setVisible(true);
                    kickblue2.setVisible(true);
                    nlblrnd1.setVisible(true);
                    nlblrnd2.setVisible(true);
                } else {
                    lblkicks.setVisible(false);
                    // lblkicks2.setVisible(true);
                    rnd1blue.setVisible(false);
                    rnd2blue.setVisible(false);
                    rnd1red.setVisible(false);
                    rnd2red.setVisible(false);
                    lblrnd1.setVisible(false);
                    lblrnd2.setVisible(false);
                    kickred1.setVisible(false);
                    kickred2.setVisible(false);
                    kickblue1.setVisible(false);
                    kickblue2.setVisible(false);
                    nlblrnd1.setVisible(false);
                    nlblrnd2.setVisible(false);


                }


            }
        }

        private class bbcheck1 implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (rnd1red.isSelected()) {
                    amount += 2;
                    ar = amount;
                    //   System.out.println(ar);
                    rs11.setText(String.valueOf(amount));
                    rs1.setText(String.valueOf(amount));
                    amount2 += 2;
                    ar2 = amount2;
                    //   System.out.println(ar2);
                    rs22.setText(String.valueOf(amount2));
                    rs2.setText(String.valueOf(amount2));
                    amount3 += 2;
                    ar3 = amount3;
                    //   System.out.println(ar3);
                    rs33.setText(String.valueOf(amount3));
                    rs3.setText(String.valueOf(amount3));
                    amount4 += 2;
                    ar4 = amount4;
                    // System.out.println(ar);
                    rs44.setText(String.valueOf(amount4));
                    rs4.setText(String.valueOf(amount4));
                    labelcolor5 a = new labelcolor5();
                    a.colorL(ab, ar);
                    rnd1red.setEnabled(false);
                    kickred1.setBackground(Color.green);

                } else {
                }
            }
        }

        private class bbcheck2 implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (rnd2red.isSelected()) {
                    amount += 2;
                    ar = amount;
                    //   System.out.println(ar);
                    rs11.setText(String.valueOf(amount));
                    rs1.setText(String.valueOf(amount));
                    amount2 += 2;
                    ar2 = amount2;
                    //   System.out.println(ar2);
                    rs22.setText(String.valueOf(amount2));
                    rs2.setText(String.valueOf(amount2));
                    amount3 += 2;
                    ar3 = amount3;
                    //   System.out.println(ar3);
                    rs33.setText(String.valueOf(amount3));
                    rs3.setText(String.valueOf(amount3));
                    amount4 += 2;
                    ar4 = amount4;
                    // System.out.println(ar);
                    rs44.setText(String.valueOf(amount4));
                    rs4.setText(String.valueOf(amount4));
                    labelcolor5 a = new labelcolor5();
                    a.colorL(ab, ar);
                    rnd2red.setEnabled(false);
                    kickred2.setBackground(Color.green);

                } else {
                }
            }
        }

        private class bbcheck3 implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (rnd1blue.isSelected()) {
                    amountb += 2;
                    ab = amountb;
                    // System.out.println(ab);
                    bs11.setText(String.valueOf(amountb));
                    bs1.setText(String.valueOf(amountb));
                    amountb2 += 2;
                    ab2 = amountb2;
                    // System.out.println(ab2);
                    bs22.setText(String.valueOf(amountb2));
                    bs2.setText(String.valueOf(amountb2));
                    amountb3 += 2;
                    ab3 = amountb3;
                    // System.out.println(ab3);
                    bs33.setText(String.valueOf(amountb3));
                    bs3.setText(String.valueOf(amountb3));
                    amountb4 += 2;
                    ab4 = amountb4;
                    // System.out.println(ab4);
                    bs44.setText(String.valueOf(amountb4));
                    bs4.setText(String.valueOf(amountb4));
                    labelcolor5 a = new labelcolor5();
                    a.colorL(ab, ar);
                    rnd1blue.setEnabled(false);
                    kickblue1.setBackground(Color.green);

                } else {
                }
            }
        }

        private class bbcheck4 implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (rnd2blue.isSelected()) {
                    amountb += 2;
                    ab = amountb;
                    //  System.out.println(ab);
                    bs11.setText(String.valueOf(amountb));
                    bs1.setText(String.valueOf(amountb));
                    amountb2 += 2;
                    ab2 = amountb2;
                    //   System.out.println(ab2);
                    bs22.setText(String.valueOf(amountb2));
                    bs2.setText(String.valueOf(amountb2));
                    amountb3 += 2;
                    ab3 = amountb3;
                    //  System.out.println(ab3);
                    bs33.setText(String.valueOf(amountb3));
                    bs3.setText(String.valueOf(amountb3));
                    amountb4 += 2;
                    ab4 = amountb4;
                    //  System.out.println(ab4);
                    bs44.setText(String.valueOf(amountb4));
                    bs4.setText(String.valueOf(amountb4));
                    labelcolor5 a = new labelcolor5();
                    a.colorL(ab, ar);
                    rnd2blue.setEnabled(false);
                    kickblue2.setBackground(Color.green);

                } else {
                }
            }
        }

        DefaultListModel model = new DefaultListModel();

        private class baddactionperformed implements ActionListener {
            public void actionPerformed(ActionEvent event)

            {
                //Заполнение массива
                for (int r=rowarray;r<ump.length; r++)//строки
                {
                    for (int c=0;c<ump.length; c++)//калонки
                    {
                        ump[r][0]=lblUmpire1.getText();
                        ump[r][1]=lblcountry.getText();
                        ump[r][2]=String.valueOf(countUmire);
                    }
                }

                rowarray++;
                countUmire++;



                model.addElement(lblUmpire1.getText()+"    "+lblcountry.getText());
                umpirelistf.setModel(model);
                //заполнение селекта данными
                String select=" ";
                for (int r=0;r<ump.length; r++)
                {
                    select=(ump[r][0] +"   "+ ump[r][1]);
                }

                boxUmpire2.addItem(select);
                boxUmpire1.addItem(select);
                boxUmpire3.addItem(select);
                boxUmpire4.addItem(select);
            if (screen==2) {
                ImageIcon img = new ImageIcon(new ImageIcon("flags/"+img_flag+".png").getImage().getScaledInstance(110, 110, Image.SCALE_DEFAULT));
                Umpire1.setIcon(img);
                Umpire2.setIcon(img);
                Umpire3.setIcon(img);
                Umpire4.setIcon(img);}
                if (screen==1) {
                    ImageIcon img = new ImageIcon(new ImageIcon("flags/"+img_flag+".png").getImage().getScaledInstance(90, 90, Image.SCALE_DEFAULT));
                    Umpire1.setIcon(img);
                    Umpire2.setIcon(img);
                    Umpire3.setIcon(img);
                    Umpire4.setIcon(img);}

                //распечатать массив
                for (int r=0;r<rowarray; r++)//строки
                {
                    System.out.println(ump[r][0]+" "+ump[r][1] +" "+ump[r][2]);
                }




            }


        }

        private class bdelactionperformed implements ActionListener {
            public void actionPerformed(ActionEvent evt) {

                model = new DefaultListModel();
                umpirelistf.setModel(model);

                dm= new DefaultComboBoxModel();
                dm2= new DefaultComboBoxModel();
                dm3= new DefaultComboBoxModel();
                dm4= new DefaultComboBoxModel();
                boxUmpire2.setModel(dm);
                boxUmpire1.setModel(dm2);
                boxUmpire3.setModel(dm3);
                boxUmpire4.setModel(dm4);



            }
        }
    }








