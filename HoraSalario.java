package git;
import java.util.Scanner;

public class HoraSalario {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
	System.out.println("Quanto voc� ganha por hora? ");
	float salarioHora = scan.nextFloat();
System.out.println("Quantas horas trabalha no dia? ");
	float horasDia = scan.nextFloat();
System.out.println("Quantos dias trabalha na semana? ");
	int diasSemana = scan.nextInt();
System.out.println("Quantas dias trabalha no m�s? ");
	int diasMes = scan.nextInt();

//REUNINDO INFO.
	float horasSemanais= (horasDia * diasSemana);
	float horasMensais= (horasSemanais * diasMes);
	
	double salarioDiario = (salarioHora * horasDia);
	double salarioSemanal = (salarioDiario * diasSemana);
	double salarioMensal = (salarioDiario * diasMes);


	System.out.println("Voc� trabalha um total de " + horasSemanais + " horas semanais.");
	System.out.println("Voc� trabalha um total de " + horasMensais+ " horas mensais.");
	System.out.println("Seu Remunerat�rio Di�rio �:   " + salarioDiario);
	System.out.println("Seu Remunerat�rio Semanal �:  " + salarioSemanal);
	System.out.println("Seu Remunerat�rio Mensal �:   " + salarioMensal);
	}
}