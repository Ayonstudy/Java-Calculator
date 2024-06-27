import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalculatorGUI extends JFrame implements ActionListener{
    
    // Panel & Label Declaration
    JPanel BGpanel = new JPanel();
    JPanel panel = new JPanel();
    JLabel answer = new JLabel();

    // Button declarations
    JButton bracket_open_button = new JButton();
    JButton bracket_close_button = new JButton();
    JButton backspace_button = new JButton();
    JButton delete_button = new JButton();

    JButton zero_button = new JButton();
    JButton one_button = new JButton();
    JButton two_button = new JButton();
    JButton three_button = new JButton();
    JButton four_button = new JButton();
    JButton five_button = new JButton();
    JButton six_button = new JButton();
    JButton seven_button = new JButton();
    JButton eight_button = new JButton();
    JButton nine_button = new JButton();

    JButton multiply_button = new JButton();
    JButton divide_button = new JButton();
    JButton plus_button = new JButton();
    JButton minus_button = new JButton();

    JButton dot_button = new JButton();
    
    JButton equal_button = new JButton();

    ImageIcon image = new ImageIcon("Smiling_Calculator_Icon.png");

    String x = "";
    CalculatorGUI(){
        // Panel & Label
        BGpanel.setBackground(Color.black);
        BGpanel.setBounds(0, 0, 383,700);

        answer.setText(x);
        answer.setVerticalAlignment(JLabel.BOTTOM);
        answer.setHorizontalAlignment(JLabel.RIGHT);
        answer.setBounds(0,5,340,90);
        answer.setFont(new Font("Verdana", Font.PLAIN, 45));
        answer.setForeground(Color.lightGray);

        panel.add(answer);
        panel.setLayout(null);
        panel.setBounds(5, 30, 360, 130);
        panel.setBackground(Color.darkGray);
        

        // (
        bracket_open_button.setBounds(10,200,80,80);
        bracket_open_button.addActionListener(this);
        bracket_open_button.setText("(");
        bracket_open_button.setFocusable(false);
        bracket_open_button.setFont(new Font("Verdana",Font.PLAIN,30));
        bracket_open_button.setBackground(Color.lightGray);
        // )
        bracket_close_button.setBounds(100,200,80,80);
        bracket_close_button.addActionListener(this);
        bracket_close_button.setText(")");
        bracket_close_button.setFocusable(false);
        bracket_close_button.setFont(new Font("Verdana",Font.PLAIN,30));
        bracket_close_button.setBackground(Color.lightGray);
        // AC
        backspace_button.setBounds(190,200,80,80);
        backspace_button.addActionListener(this);
        backspace_button.setText("AC");
        backspace_button.setFocusable(false);
        backspace_button.setFont(new Font("Verdana",Font.PLAIN,25));
        backspace_button.setBackground(Color.lightGray);
        // Del
        delete_button.setBounds(280,200,80,80);
        delete_button.addActionListener(this);
        delete_button.setText("Del");
        delete_button.setFocusable(false);
        delete_button.setFont(new Font("Verdana",Font.PLAIN,25));
        delete_button.setBackground(Color.red);
        delete_button.setForeground(Color.white);


        // 0
        zero_button.setBounds(100,560,80,80);
        zero_button.addActionListener(this);
        zero_button.setText("0");
        zero_button.setFocusable(false);
        zero_button.setFont(new Font("Verdana",Font.PLAIN,30));
        zero_button.setBackground(Color.darkGray);
        zero_button.setForeground(Color.white);
        // 1
        one_button.setBounds(10,470,80,80);
        one_button.addActionListener(this);
        one_button.setText("1");
        one_button.setFocusable(false);
        one_button.setFont(new Font("Verdana",Font.PLAIN,30));
        one_button.setBackground(Color.darkGray);
        one_button.setForeground(Color.white);
        // 2
        two_button.setBounds(100,470,80,80);
        two_button.addActionListener(this);
        two_button.setText("2");
        two_button.setFocusable(false);
        two_button.setFont(new Font("Verdana",Font.PLAIN,30));
        two_button.setBackground(Color.darkGray);
        two_button.setForeground(Color.white);
        // 3
        three_button.setBounds(190,470,80,80);
        three_button.addActionListener(this);
        three_button.setText("3");
        three_button.setFocusable(false);
        three_button.setFont(new Font("Verdana",Font.PLAIN,30));
        three_button.setBackground(Color.darkGray);
        three_button.setForeground(Color.white);
        // 4
        four_button.setBounds(10,380,80,80);
        four_button.addActionListener(this);
        four_button.setText("4");
        four_button.setFocusable(false);
        four_button.setFont(new Font("Verdana",Font.PLAIN,30));
        four_button.setBackground(Color.darkGray);
        four_button.setForeground(Color.white);
        // 5
        five_button.setBounds(100,380,80,80);
        five_button.addActionListener(this);
        five_button.setText("5");
        five_button.setFocusable(false);
        five_button.setFont(new Font("Verdana",Font.PLAIN,30));
        five_button.setBackground(Color.darkGray);
        five_button.setForeground(Color.white);
        // 6
        six_button.setBounds(190,380,80,80);
        six_button.addActionListener(this);
        six_button.setText("6");
        six_button.setFocusable(false);
        six_button.setFont(new Font("Verdana",Font.PLAIN,30));
        six_button.setBackground(Color.darkGray);
        six_button.setForeground(Color.white);
        // 7
        seven_button.setBounds(10,290,80,80);
        seven_button.addActionListener(this);
        seven_button.setText("7");
        seven_button.setFocusable(false);
        seven_button.setFont(new Font("Verdana",Font.PLAIN,30));
        seven_button.setBackground(Color.darkGray);
        seven_button.setForeground(Color.white);
        // 8
        eight_button.setBounds(100,290,80,80);
        eight_button.addActionListener(this);
        eight_button.setText("8");
        eight_button.setFocusable(false);
        eight_button.setFont(new Font("Verdana",Font.PLAIN,30));
        eight_button.setBackground(Color.darkGray);
        eight_button.setForeground(Color.white);
        // 9
        nine_button.setBounds(190,290,80,80);
        nine_button.addActionListener(this);
        nine_button.setText("9");
        nine_button.setFocusable(false);
        nine_button.setFont(new Font("Verdana",Font.PLAIN,30));
        nine_button.setBackground(Color.darkGray);
        nine_button.setForeground(Color.white);


        // *
        multiply_button.setBounds(280,290,80,80);
        multiply_button.addActionListener(this);
        multiply_button.setText("*");
        multiply_button.setFocusable(false);
        multiply_button.setFont(new Font("Verdana",Font.PLAIN,30));
        multiply_button.setBackground(Color.orange);
        multiply_button.setForeground(Color.white);
        // /
        divide_button.setBounds(280,380,80,80);
        divide_button.addActionListener(this);
        divide_button.setText("/");
        divide_button.setFocusable(false);
        divide_button.setFont(new Font("Verdana",Font.PLAIN,30));
        divide_button.setBackground(Color.orange);
        divide_button.setForeground(Color.white);
        // +
        plus_button.setBounds(280,470,80,80);
        plus_button.addActionListener(this);
        plus_button.setText("+");
        plus_button.setFocusable(false);
        plus_button.setFont(new Font("Verdana",Font.PLAIN,30));
        plus_button.setBackground(Color.orange);
        plus_button.setForeground(Color.white);
        // -
        minus_button.setBounds(280,560,80,80);
        minus_button.addActionListener(this);
        minus_button.setText("-");
        minus_button.setFocusable(false);
        minus_button.setFont(new Font("Verdana",Font.PLAIN,30));
        minus_button.setBackground(Color.orange);
        minus_button.setForeground(Color.white);


        // .
        dot_button.setBounds(10,560,80,80);
        dot_button.addActionListener(this);
        dot_button.setText(".");
        dot_button.setFocusable(false);
        dot_button.setFont(new Font("Verdana",Font.PLAIN,30));
        dot_button.setBackground(Color.darkGray);
        dot_button.setForeground(Color.white);
        // =
        equal_button.setBounds(190,560,80,80);
        equal_button.addActionListener(this);
        equal_button.setText("=");
        equal_button.setFocusable(false);
        equal_button.setFont(new Font("Verdana",Font.PLAIN,30));
        equal_button.setBackground(Color.darkGray);
        equal_button.setForeground(Color.white);

        //Main GUI
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(383,700);
        this.setVisible(true);
        this.setTitle("Smiling Calculator");
        this.setIconImage(image.getImage());

        // Adds
        this.add(bracket_open_button);
        this.add(bracket_close_button);
        this.add(backspace_button);
        this.add(delete_button);

        this.add(zero_button);
        this.add(one_button);
        this.add(two_button);
        this.add(three_button);
        this.add(four_button);
        this.add(five_button);
        this.add(six_button);
        this.add(seven_button);
        this.add(eight_button);
        this.add(nine_button);

        this.add(multiply_button);
        this.add(divide_button);
        this.add(plus_button);
        this.add(minus_button);

        this.add(dot_button);
        this.add(equal_button);

        this.add(panel);
        this.add(BGpanel);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bracket_open_button){
            x += "(";
            answer.setText(x);
        } else if(e.getSource()==bracket_close_button){
            x += ")";
            answer.setText(x);
        } else if(e.getSource()==backspace_button){
               if ((x.length() > 0)) {
                  x = x.substring(0, x.length() - 1);
                }
                answer.setText(x);
        } else if(e.getSource()==delete_button){
            x = "";
            answer.setText(x);
        } else if(e.getSource()==zero_button){
            x+="0";
            answer.setText(x);
        } else if(e.getSource()==one_button){
            x+="1";
            answer.setText(x);
        } else if(e.getSource()==two_button){
            x+="2";
            answer.setText(x);
        } else if(e.getSource()==three_button){
            x+="3";
            answer.setText(x);
        } else if(e.getSource()==four_button){
            x+="4";
            answer.setText(x);
        } else if(e.getSource()==five_button){
            x+="5";
            answer.setText(x);
        } else if(e.getSource()==six_button){
            x+="6";
            answer.setText(x);
        } else if(e.getSource()==seven_button){
            x+="7";
        } else if(e.getSource()==eight_button){
            x+="8";
            answer.setText(x);
        } else if(e.getSource()==nine_button){
            x+="9";
            answer.setText(x);
        } else if(e.getSource()==multiply_button){
            x+="*";
            answer.setText(x);
        } else if(e.getSource()==divide_button){
            x+="/";
            answer.setText(x);
        } else if(e.getSource()==plus_button){
            x+="+";
            answer.setText(x);
        } else if(e.getSource()==minus_button){
            x+="-";
            answer.setText(x);
        } else if(e.getSource()==dot_button){
            x+=".";
            answer.setText(x);
        } else if(e.getSource()==equal_button){
            // Make Evaluator.java
                new File("Evaluator.java");

            // Write in Evaluator.java
            try {
                FileWriter myWriter = new FileWriter("Evaluator.java");
                myWriter.write("import java.io.File;import java.io.FileWriter;import java.io.IOException;public class Evaluator {public static void main(String args[]){int z =" + x + ";String A = String.valueOf(z);new File(\"Answer.txt\");try {FileWriter myWriter = new FileWriter(\"Answer.txt\");myWriter.write(A);myWriter.close();} catch (IOException i) {System.out.println(\"An error occurred.\");i.printStackTrace();}}}");
                myWriter.close();
            } catch (IOException i) {
                System.out.println("An error occurred.");
                i.printStackTrace();
            }

            // Compile and Run Evaluator class
            CMDcommand cmd = new CMDcommand();
            try {
                cmd.executeCommand();
            } catch (IOException | InterruptedException e1) {
                e1.printStackTrace();
            }
            
            // Pull calculated value from Answer.txt
            try {
                File myObj2 = new File("Answer.txt");
                Scanner myReader = new Scanner(myObj2);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    x = data;
                answer.setText(x);
                }
                myReader.close();
            } catch (FileNotFoundException i) {
                System.out.println("An error occurred.");
                i.printStackTrace();
            }
        }
    }
}