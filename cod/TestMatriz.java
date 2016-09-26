package cod;


import javax.swing.JOptionPane;

public class TestMatriz {
	public static void main(String[] args) {
		
		Matriz a;
		Matriz b;
		Matriz ab;
		
		int l1,l2,c1,c2;
		
		l1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de linhas da matriz 1:"));
		c1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de coluna da matriz 1:"));
		l2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de linhas da matriz 2:"));
		c2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de coluna da matriz 2:"));
		
		a = new Matriz(l1,c1);
		b = new Matriz(l2,c2);
		
		a.insetValorTotal();
		b.insetValorTotal();
		
		if(a.getColuna()==b.getLinha()){
			ab = Calculadora.multiplicacao(a,b);
			
			JOptionPane.showMessageDialog(null, "Resposta:\n"+ab.mostra());
			
		}else{
			JOptionPane.showMessageDialog(null, "Calculo invalido!");
		}
		
		
	}

}
