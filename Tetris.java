import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class Tetris extends JFrame {

    JLabel statusbar;


    public Tetris( int width ) {

        statusbar = new JLabel(" 0");
        add(statusbar, BorderLayout.SOUTH);
        Board board = new Board(this , width);
        add(board);
        board.start();

        setSize(width * 20, 400);
        setTitle("Tetris");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
   }

   public JLabel getStatusBar() {
       return statusbar;
   }

    public static void main(String[] args) {
				
				int width = 10;
				if( args.length > 0 )
					width = Integer.parseInt( args[0] );

        Tetris game = new Tetris( width );
        game.setLocationRelativeTo(null);
        game.setVisible(true);

    } 
}