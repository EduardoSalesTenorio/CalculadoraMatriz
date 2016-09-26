package cod;

public class Calculadora {

	public static Matriz soma(Matriz m1, Matriz m2) {

		double[][] aux = new double[m1.getLinha()][m1.getColuna()];

		for (int i = 0; i < aux.length; i++) {
			for (int j = 0; j < aux.length; j++) {
				aux[i][j] = m1.getElemento(i, j)+m2.getElemento(i, j);
			}

		}
		return new Matriz(aux);

	}

	public static Matriz subtracao(Matriz m1, Matriz m2) {
		double[][] aux = new double[m1.getLinha()][m1.getColuna()];

		for (int i = 0; i < aux.length; i++) {
			for (int j = 0; j < aux.length; j++) {
				aux[i][j] = m1.getElemento(i, j)-m2.getElemento(i, j);
			}

		}
		return new Matriz(aux);

	}

	public static Matriz multiplicacao(Matriz m1, Matriz m2) {

		double[][] aux = new double[m1.getLinha()][m2.getColuna()];

		for (int i = 0; i < aux.length; i++) {
			for (int j = 0; j < aux.length; j++) {
				for (int k = 0; k < m2.getLinha(); k++) {
					aux[i][j] += m1.getElemento(i, k) * m2.getElemento(k, j);
				}
			}

		}
		return new Matriz(aux);

	}

}
