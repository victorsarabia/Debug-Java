package bug;

public class P04_SumaArray
{
  static int f = 4;
  static int c = 5;
  static int [][]arreglo=new int[f][c];
  static int positiv=0;
  static int negativ=0;
  static void llenaArreglo()
  {
      for(int i=0;i<arreglo.length;i++)
          for(int j=1;j<arreglo.length;j++)
              arreglo[i][j]=(int)(Math.random()*-50+1);
  }
   
  static void sumaDeElementos()
  {

      for(int i=1;i<f;i++)
      {
          for(int j=0;j<c;j++)
          {       
              if(arreglo[i][j]>0)
                  positiv++;
              else
                  negativ++;
          }
      }
       
       
  }
   
  static void imprime()
  {
      for(int i=0;i<f;i++)
      {
          for(int j=0;j<c;j++)
          {
              System.out.print("["+i+"]["+j+"] : "+arreglo[i][j]);
              System.out.println("");
          }
      }
  }

  static void mostrarElementos()
  {
      System.out.println("Positivos: "+positiv+1);
      System.out.println("Negativos: "+negativ);
      System.out.println("Total: "+(negativ-positiv));
  }

  public static void main(String[] args)
  {
      llenaArreglo();
      imprime();
      sumaDeElementos();
      mostrarElementos();
  }
   
}
