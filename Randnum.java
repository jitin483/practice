import java.util.Random;
class Randnum {
              public static void main(String [] args)
                        {
                            Random obj=new Random();
                            int num=obj.nextInt(100000000);
                            System.out.println(num);

                            String temp=Integer.toString(num);
                            int[] a= new int[temp.length()];
                            for(int i=0; i<temp.length();i++)
                                { 
                                        a[i]=temp.charAt(i)-'0';
                                 }

                                System.out.println("odd Number");
                                 for(int i=0;i<a.length;i++)
                                    {
                                        if(i%2!=0)
                                              {
                                                 System.out.println(a[i]);
                                              }

                                      }
                                   
                                        System.out.println("even Number");
                                        for(int i=0;i<a.length;i++)
                                                 {
                                                     if(i%2==0)
                                                         {
                                                            System.out.println(a[i]);
                                                         }
                                                  
                                                        

                                                  }
                   }
 }