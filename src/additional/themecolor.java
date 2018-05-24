package additional;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import static main.adminscreen.theme;
import static main.mainform.frame1;
import static main.mainscreen.*;

/**
 * Created by Andrew on 12.03.2017.
 */
public class themecolor implements ActionListener {


    public void actionPerformed(ActionEvent event) {
        if (event.getActionCommand().equals("Black")) {
            frame1.getContentPane().setBackground(Color.BLACK);


            lblcategory.setForeground(Color.white);
            lblcategory.setBackground(Color.black);

            // номер боя (надпись)

            lblmatch.setForeground(Color.white);
            lblmatch.setVerticalAlignment(0);

            lblmatch.setBackground(Color.black);
            lblmatch.setOpaque(true);

            // номер боя



            lblMatchNo.setForeground(Color.white);
            lblMatchNo.setBorder(BorderFactory.createLineBorder(Color.white,5));
            lblMatchNo.setBackground(Color.black);
            lblMatchNo.setOpaque(true);
            //      таймер


            lbltimer1.setForeground(Color.white);
            lbltimer1.setBackground(Color.black);
            lbltimer1.setOpaque(true);


            //   кто побеждает





//

           Umpire1.setBackground(Color.black);
            Umpire1.setOpaque(true);
           Umpire1.setBorder(BorderFactory.createLineBorder(Color.white));
            Umpire1.setForeground(Color.white);



            Umpire2.setBackground(Color.black);
            Umpire2.setOpaque(true);
            Umpire2.setBorder(BorderFactory.createLineBorder(Color.white));
            Umpire2.setForeground(Color.white);



            Umpire3.setBackground(Color.black);
            Umpire3.setOpaque(true);
          Umpire3.setBorder(BorderFactory.createLineBorder(Color.white));
            Umpire3.setForeground(Color.white);


           Umpire4.setBackground(Color.black);
            Umpire4.setOpaque(true);
           Umpire4.setBorder(BorderFactory.createLineBorder(Color.white));
            Umpire4.setForeground(Color.white);



           round.setBackground(Color.black);
            round.setOpaque(true);
            round.setForeground(Color.white);
            //  судья 1
            rs1.setForeground(Color.white);
            rs1.setBackground(Color.red);
            rs1.setOpaque(true);


            bs1.setForeground(Color.white);
            bs1.setBackground(Color.blue);
            bs1.setOpaque(true);


            //  судья 2


            rs2.setForeground(Color.white);
            rs2.setBackground(Color.red);

            rs2.setOpaque(true);



            bs2.setForeground(Color.white);
            bs2.setBackground(Color.blue);

            bs2.setOpaque(true);


            //судья 3

            rs3.setForeground(Color.white);
            rs3.setBackground(Color.red);
            rs3.setOpaque(true);



            bs3.setForeground(Color.white);
            bs3.setBackground(Color.blue);

            bs3.setOpaque(true);


            // судья 4


            rs4.setForeground(Color.white);
            rs4.setBackground(Color.red);

            rs4.setOpaque(true);


            bs4.setForeground(Color.white);
            bs4.setBackground(Color.blue);
            bs4.setOpaque(true);


            //участники 1 и 2

            rcompetitor.setForeground(Color.white);
            rcompetitor.setBackground(Color.red);
            rcompetitor.setOpaque(true);


            bcompetitor.setForeground(Color.white);
            bcompetitor.setBackground(Color.blue);
            bcompetitor.setOpaque(true);



            btotal.setForeground(Color.white);
            btotal.setBackground(Color.blue);
            btotal.setBorder(BorderFactory.createLineBorder(Color.white,3));
            btotal.setOpaque(true);



            rtotal.setForeground(Color.white);
            rtotal.setBackground(Color.red);
            rtotal.setBorder(BorderFactory.createLineBorder(Color.white,3));
            rtotal.setOpaque(true);

// штрафы


            rpenalty.setBackground(Color.yellow);
            rpenalty.setOpaque(true);
            rpenalty.setBorder(BorderFactory.createLineBorder(Color.white,3));



            bpenalty.setBackground(Color.yellow);
            bpenalty.setOpaque(true);
            bpenalty.setBorder(BorderFactory.createLineBorder(Color.white,3));


//  предупреждения


            rwarnings.setForeground(Color.black);
            rwarnings.setBackground(Color.LIGHT_GRAY);
            rwarnings.setBorder(BorderFactory.createLineBorder(Color.white,3));
            rwarnings.setOpaque(true);



            bwarnings.setForeground(Color.black);

            bwarnings.setBackground(Color.lightGray);
            bwarnings.setOpaque(true);
            bwarnings.setBorder(BorderFactory.createLineBorder(Color.white,3));

//            bwarnings.setLocation(55, 300);
//            bwarnings.setSize(120, 200);
//            bwarnings.setHorizontalAlignment(0);
//            bwarnings.setForeground(Color.black);
//            bwarnings.setOpaque(true);
//            bwarnings.setFont(new Font("Arial",Font.BOLD,90));
//            bwarnings.setBorder(BorderFactory.createLineBorder(Color.white,3));


            kickblue1.setBorder(BorderFactory.createLineBorder(Color.white,3));
            kickblue2.setBorder(BorderFactory.createLineBorder(Color.white,3));
            kickred1.setBorder(BorderFactory.createLineBorder(Color.white,3));
            kickred2.setBorder(BorderFactory.createLineBorder(Color.white,3));
            nlblrnd2.setBackground(Color.black);
            nlblrnd1.setBackground(Color.black);
            nlblrnd2.setForeground(Color.white);
            nlblrnd1.setForeground(Color.white);

            theme.setText("White");




        } else if (event.getActionCommand().equals("White")) {
            frame1.getContentPane().setBackground(Color.LIGHT_GRAY);
            frame1.setExtendedState(JFrame.MAXIMIZED_BOTH);
            lblcategory.setBackground(Color.LIGHT_GRAY);
            lblcategory.setForeground(Color.black);
            //  lblcategory.setBorder(BorderFactory.createLineBorder(Color.black));
            // timer.setBackground(Color.yellow);
            lblcategory.setOpaque(true);
            // номер боя (надпись)

            lblmatch.setBackground(Color.LIGHT_GRAY);
            lblmatch.setForeground(Color.black);
            lblmatch.setVerticalAlignment(0);

            lblmatch.setOpaque(true);

            // номер боя



            lblMatchNo.setForeground(Color.black);
            lblMatchNo.setBackground(Color.LIGHT_GRAY);
            lblMatchNo.setBorder(BorderFactory.createLineBorder(Color.black,5));
            // timer.setBackground(Color.yellow);
            lblMatchNo.setOpaque(true);
            //      таймер


            lbltimer1.setForeground(Color.black);
            lbltimer1.setBackground(Color.LIGHT_GRAY);
            // lbltimer1.setBorder(BorderFactory.createLineBorder(Color.black));
            // timer.setBackground(Color.yellow);
            lbltimer1.setOpaque(true);


            //   кто побеждает



//

            Umpire1.setBackground(Color.LIGHT_GRAY);
            Umpire1.setOpaque(true);
            Umpire1.setBorder(BorderFactory.createLineBorder(Color.black));
            Umpire1.setForeground(Color.black);

            Umpire2.setBackground(Color.LIGHT_GRAY);
            //Umpire1.setBackground(Color.yellow);
            Umpire2.setOpaque(true);
            Umpire2.setBorder(BorderFactory.createLineBorder(Color.black));
            Umpire2.setForeground(Color.black);

            Umpire3.setBackground(Color.LIGHT_GRAY);

            //Umpire1.setBackground(Color.yellow);
            Umpire3.setOpaque(true);
            Umpire3.setBorder(BorderFactory.createLineBorder(Color.black));
            Umpire3.setForeground(Color.black);

            Umpire4.setBackground(Color.LIGHT_GRAY);

            //Umpire1.setBackground(Color.yellow);
            Umpire4.setOpaque(true);
            Umpire4.setBorder(BorderFactory.createLineBorder(Color.black));
            Umpire4.setForeground(Color.black);



            round.setBackground(Color.LIGHT_GRAY);
            round.setOpaque(true);
            //  round.setBorder(BorderFactory.createLineBorder(Color.black));
            round.setForeground(Color.black);


            //  судья 1



            rs1.setForeground(Color.white);
            rs1.setBackground(Color.red);
            rs1.setOpaque(true);



            bs1.setForeground(Color.white);
            bs1.setBackground(Color.blue);
            bs1.setOpaque(true);


            //  судья 2


            rs2.setForeground(Color.white);
            rs2.setBackground(Color.red);
            rs2.setOpaque(true);


            bs2.setForeground(Color.white);
            bs2.setBackground(Color.blue);

            bs2.setOpaque(true);


            //судья 3

            rs3.setForeground(Color.white);
            rs3.setBackground(Color.red);
            rs3.setOpaque(true);



            bs3.setForeground(Color.white);
            bs3.setBackground(Color.blue);
            bs3.setOpaque(true);


            // судья 4


            rs4.setForeground(Color.white);
            rs4.setBackground(Color.red);
            rs4.setOpaque(true);



            bs4.setForeground(Color.white);
            bs4.setBackground(Color.blue);
            bs4.setOpaque(true);


            //участники 1 и 2

            rcompetitor.setForeground(Color.white);
            rcompetitor.setBackground(Color.red);
            rcompetitor.setOpaque(true);



            bcompetitor.setForeground(Color.white);
            bcompetitor.setBackground(Color.blue);
            bcompetitor.setOpaque(true);


            // общие очки

            btotal.setForeground(Color.white);
            btotal.setBackground(Color.blue);
            btotal.setBorder(BorderFactory.createLineBorder(Color.black,3));
            btotal.setOpaque(true);



            rtotal.setForeground(Color.white);
            rtotal.setBackground(Color.red);
            rtotal.setBorder(BorderFactory.createLineBorder(Color.black,3));
            rtotal.setOpaque(true);

// штрафы


            rpenalty.setBackground(Color.yellow);
            rpenalty.setOpaque(true);
            rpenalty.setBorder(BorderFactory.createLineBorder(Color.black,3));


            bpenalty.setBackground(Color.yellow);
            bpenalty.setOpaque(true);
            bpenalty.setBorder(BorderFactory.createLineBorder(Color.black,3));


//  предупреждения


            rwarnings.setForeground(Color.black);
            rwarnings.setBorder(BorderFactory.createLineBorder(Color.black,3));



            bwarnings.setForeground(Color.black);
            bwarnings.setBorder(BorderFactory.createLineBorder(Color.black,3));

            kickblue1.setBorder(BorderFactory.createLineBorder(Color.black,3));
            kickblue2.setBorder(BorderFactory.createLineBorder(Color.black,3));
            kickred1.setBorder(BorderFactory.createLineBorder(Color.black,3));
            kickred2.setBorder(BorderFactory.createLineBorder(Color.black,3));
            nlblrnd2.setBackground(Color.LIGHT_GRAY);
            nlblrnd1.setBackground(Color.LIGHT_GRAY);
            nlblrnd2.setForeground(Color.black);
            nlblrnd1.setForeground(Color.black);

            theme.setText("Black");

        }
        else {

        }
    }



}

