package cod;

import javax.swing.JOptionPane;

public class Matriz {

	private int linha;
	private int coluna;
	private double[][] matriz;

	public Matriz(int linha, int coluna) {

		this.linha = linha;
		this.coluna = coluna;
		this.matriz = new double[linha][coluna];
	}

	public Matriz(double[][] matriz) {
		this.matriz = matriz;
		linha = matriz.length;
		coluna = matriz[0].length;
	}

	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}

	public double getElemento(int i, int j) {
		return matriz[i][j];
	}

	public void setElemento(int i, int j,double valor) {
		matriz[i][j] = valor;
	}

	// Ta errado, eu sei!
	public void insetValorTotal() {

		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				matriz[i][j] = Double
						.parseDouble(JOptionPane.showInputDialog("Digite o o valor da intersecção " + (i+1) + (j+1)));

			}
		}
	}

	public void insetValorElemento(int i, int j) {

	}

	// toString()
	public String mostra() {

		String aux = "";

		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				aux += " " + matriz[i][j];

			}
			aux += "\n";
		}

		return aux;

	}

}
