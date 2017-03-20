package game2048;

import java.awt.*;
import javax.swing.*; 
public class My2048 extends JFrame { 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//���캯��
	public My2048(){    
		setTitle("2048");//���ñ���    
		setSize(400, 400);//�趨���ڴ�С   
		setLocation(500, 200);//�趨������ʼλ��    
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
		getContentPane().setLayout(new GridLayout(4, 4, 5, 5));//�趨���ַ�ʽΪGridLayout��     
		new Operation(this);  
		this.setVisible(true);//��Ϊ����  
		}  
	//������ڵ�
	public static void main(String args[]) {    
		try { 
			//�趨UI
			UIManager.setLookAndFeel("org.jvnet.substance.skin.SubstanceRavenGraphiteLookAndFeel");  
			} //�����׳����쳣     
		catch (ClassNotFoundException | InstantiationException| 
				IllegalAccessException |
				UnsupportedLookAndFeelException e){      
			e.printStackTrace(); 
		} 
		JFrame.setDefaultLookAndFeelDecorated(true);//�趨Frame��ȱʡ���    
		new My2048(); 
	} 
	 
}



