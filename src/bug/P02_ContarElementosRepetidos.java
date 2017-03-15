package bug;


public class P02_ContarElementosRepetidos{
  static int A=10;
  static int B=20;
  static int vectorA[]=new int[A];
  static int vectorB[]=new int[B];
  static int elemA=0; 
  static int elemB=0;
  static int z=0;
  static void llenaArreglo(){
      for(int i=0;i<vectorA.length-1;i++){
          vectorA[i]=(int)(Math.random()*100);
      }

      for(int i=0;i<vectorB.length-1;i++){
          vectorB[i]=(int)(Math.random()*100);
      }

  }

  static void compara(){
      for(int i=0;i<vectorA.length;i++){
          for(int j=0;j<vectorB.length;j++){
              if(vectorA[i]==vectorB[j])
                  elemA++;
          }
          System.out.println("El elemento "+vectorA[i]+" se presenta "+elemA+" veces en B");
          elemA=1;
      }
  }

  static void imprimir(){
      for(int i=0;i<vectorA.length;i++){
          System.out.print("A"+"["+i+"]= "+vectorA[i]+"\n");
      }
      for(int i=0;i<vectorB.length;i++){
          System.out.print("B"+"["+i+"]="+vectorB[i]+"\n");
      }
  }

  public static void main(String[] args){
      llenaArreglo();
      imprimir();
      compara();
  }
   
}