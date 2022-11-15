package snakegame;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Snake Game");
		frame.setBounds(10, 10, 905, 650);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String line;StringBuffer stringBuffer= new StringBuffer();
		
		try{
			File file = new File("C:\\Users\\localadmin\\Downloads\\rajbhai.txt");
			FileReader fileReader = new FileReader(file);			
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while ((line = bufferedReader.readLine()) != null) {					
				stringBuffer.append(line);
				stringBuffer.append("\n");
			}
			bufferedReader.close();
			fileReader.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		
		GamePanel panel = new GamePanel(stringBuffer.toString());
		panel.setBackground(Color.darkGray);
		frame.add(panel);
		
		frame.setVisible(true);
		
		
	}

}
