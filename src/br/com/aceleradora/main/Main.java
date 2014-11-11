package br.com.aceleradora.main;

public class Main {

	public static void main(String[] args) {
		ProdutoComparavel pa = new ProdutoComparavel();
		ProdutoComparavel pb = new ProdutoComparavel();
		
		ProdutoComparavel pc = new ProdutoComparavel();
		ProdutoComparavel pd = new ProdutoComparavel();

		pa.setNome("Doce de leite");
		pa.setDescricao("Doce");
		pa.setPreco(5);

		pb.setNome("Doce de leite");
		pb.setDescricao("Doce");
		pb.setPreco(5);
		
		pc.setNome("Coca-Cola");
		pc.setDescricao("Refrigerante");
		pa.setPreco(14);
		
		pd.setNome("Cookie do Subway");
		pd.setDescricao("' O cara paga R$6,50 por três bolachas' - Marcus");
		pd.setPreco(40);
		
		
		
		try {
			System.out.println("Comparando dois objetos iguais (pa e pb) com hashcode: ");
			
			Thread.sleep(1500);
			
			System.out.println("pa: " + pa.hashCode() + " == pb: "
					+ pb.hashCode() + " - " + (pa.hashCode() == pb.hashCode()));
			
			System.out.println();

			System.out.println("Hashcodes são recomendáveis para utilizar em tabelas de espelhamento, tornam o objeto mais fácil de encontrar.");

			Thread.sleep(1500);

			System.out.println("");
			System.out.println("");
			
			System.out.println("Comparando dois objetos diferentes com equals: ");
			System.out.println("pc == pd : " + pc.equals(pd));
			
			System.out.println();
			
			System.out.println("Ambos os métodos podem ser gerados pela IDE, no eclipse, por exemplo, basta ir na opção source do menu de contexto.");
			
			
		} catch (Exception ex) {}
	}
}
