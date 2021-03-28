package ex_3;

public class Main {

	public static void main(String[] args) {
		Supervisor r1 = new Supervisor();
		Supervisor r2 = new Supervisor();
		Supervisor r3 = new Supervisor();
		Supervisor r4 = new Supervisor();
		Supervisor r5 = new Supervisor();
		
		Veiculo v1 = new Veiculo();
		v1.setPlaca("231");
		v1.setVelocidade(50);
		Veiculo v2 = new Veiculo();
		v2.setPlaca("234");
		v2.setVelocidade(80);
		Veiculo v3 = new Veiculo();
		v3.setPlaca("212");
		v3.setVelocidade(40);
		Veiculo v4 = new Veiculo();
		v4.setPlaca("255");
		v4.setVelocidade(30);
		Veiculo v5 = new Veiculo();
		v5.setPlaca("543");
		v5.setVelocidade(20);
		Veiculo v6 = new Veiculo();
		v6.setPlaca("122");
		v6.setVelocidade(10);
		Veiculo v7 = new Veiculo();
		v7.setPlaca("111");
		v7.setVelocidade(67);
		Veiculo v8 = new Veiculo();
		v8.setPlaca("064");
		v8.setVelocidade(140);
		Veiculo v9 = new Veiculo();
		v9.setPlaca("230");
		v9.setVelocidade(200);
		Veiculo v10 = new Veiculo();
		v10.setPlaca("123");
		v10.setVelocidade(134);
		
		
		v1.adicionar(r1);
		v1.acelerar();
		
		v2.adicionar(r1);
		v2.acelerar();
		
		v3.adicionar(r2);
		v3.acelerar();
		
		v4.adicionar(r2);
		v4.acelerar();
		
		v5.adicionar(r3);
		v5.acelerar();
		
		v6.adicionar(r3);
		v6.acelerar();
		
		v7.adicionar(r4);
		v7.acelerar();
		
		v8.adicionar(r4);
		v8.acelerar();
		
		v9.adicionar(r5);
		v9.acelerar();
		
		v10.adicionar(r5);
		v10.acelerar();
		
		
		System.out.println("Radar 1: " + r1.getRegistros());
		System.out.println("Radar 2: " + r2.getRegistros());
		System.out.println("Radar 3: " + r3.getRegistros());
		System.out.println("Radar 4: " + r4.getRegistros());
		System.out.println("Radar 5: " + r5.getRegistros());

	}

}
