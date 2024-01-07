import javax.swing.*;

class App {

    private static void initWindow() {
        
        JFrame window = new JFrame("Can't Stop, Won't Stop, GameStop");
       window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      
        Board board = new Board();
       
        window.add(board);

        window.addKeyListener(board);

    
        window.setResizable(false);
    
        window.pack();

        window.setLocationRelativeTo(null);
 
        window.setVisible(true);
    }

    public static void main(String[] args) {
        // invokeLater() is used here to prevent our graphics processing from

            public void run() {
                initWindow();
            }
        });
    }
}
