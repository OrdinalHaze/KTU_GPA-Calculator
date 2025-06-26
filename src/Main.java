import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        System.out.print("Enter Your Name : ");
        name=scanner.nextLine();

        double grade;
        Boolean isWorking=true;
        int select;
        int num1;
        double credit;

        double sum1=0;
        double totalCredit=0;

        while(isWorking){

            System.out.println("Welcome " + name + " to KTU GPA CALCULATOR\n");

            System.out.println("********************");
            System.out.println("   KTU CALCULATOR    ");
            System.out.println("*********************");

            System.out.println("**********************");
            System.out.println("1. SGPA calculator ");
            System.out.println("2. CGPA calculator ");
            System.out.println("3. Exit ");
            System.out.println("**********************");



            System.out.print("Enter Your choice : ");
            select=scanner.nextInt();
            scanner.nextLine();

            switch(select){
                case 1 ->{
                    
                    System.out.println("*****************************");
                    System.out.println("Welcome to SGPA CAlCUlATOR");
                    System.out.println("*****************************");
                    System.out.println("*****************************");
                    System.out.println("Quick Remainder!!!");
                    System.out.println("S grade = 10 gradepoint");
                    System.out.println("A+ grade = 9 gradepoint");
                    System.out.println("A grade = 8.5 gradepoint");
                    System.out.println("B+ grade = 8 gradepoint");
                    System.out.println("B grade = 7 gradepoint");
                    System.out.println("C grade = 6 gradepoint");
                    System.out.println("P grade = 5 gradepoint");
                    System.out.println("F grade = 0 gradepoint");
                    System.out.println("*****************************");


                    System.out.print("Enter no. of Subjects : ");
                    num1=scanner.nextInt();
                    scanner.nextLine();

                    for(int i=0; i<num1;i++){

                    System.out.print("Enter Subject Grade point : ");
                    grade=scanner.nextDouble();
                    System.out.print("Enter the Credit : ");
                    credit=scanner.nextDouble();
                    
                    totalCredit += credit;
                    sum1 += credit*grade;
                    
                    }
                    double totalSgpa=sum1/totalCredit;
                    System.out.printf("Total Sgpa : %.3f \n",totalSgpa);


                }
                case 2 -> {
                    
                    
                    System.out.println("*****************************");
                    System.out.println("Welcome to CGPA CAlCUlATOR");
                    System.out.println("*****************************");
                    System.out.println("*****************************");
                    

                    System.out.print("Enter no. of Semesters : ");
                    num1=scanner.nextInt();
                    scanner.nextLine();

                    for(int i=1; i<=num1;i++){

                    System.out.print("Enter SGPA in Semester " + i + " : ");
                    grade=scanner.nextDouble();
                    System.out.print("Enter the number of Credits in Semester " + i + " : ");
                    credit=scanner.nextDouble();
                    
                    totalCredit += credit;
                    sum1 += credit*grade;
                    
                    }
                    double totalSgpa=sum1/totalCredit;
                    System.out.printf("Total CGPA : %.3f \n",totalSgpa);
                        }
                case 3 ->{
                    isWorking=false;
                            System.out.println("*********************************************");
                            System.out.println("THANK YOU FOR USING KTU GRADE CALCULATOR!!!!");
                            System.out.println("*********************************************");

                }
                default -> System.out.println("Invalid Input");
            }



        }
        scanner.close();
    }
}
