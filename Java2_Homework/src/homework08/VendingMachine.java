package homework08;

import java.util.Stack;

/* wait()�� notify()�� �̿��Ͽ� �ϼ�
	
	Stack store=new Stack();

    pop()   :  ���� 
    push()  :  �ֱ�
*/
/*[����2]���Ǳ� ���α׷��� ����ÿ�

Ŭ������ : VendingMachine
               +getDrink():String
               +putDrink(drink String):void
             
            [����]
	     wait()�� notify()�� �̿��Ͽ� �ϼ�
	       Stack store=new Stack();

	       pop() :  ���� 
	       push():  �ֱ�
	    
Ŭ������ : Producer     <-- Thread���
Ŭ������ : Consumer     <-- Thread���
Ŭ������ : MainEx.java
               VendingMachine vm=new VendingMachine();
     
               Producer p=new Producer(vm);
               Consumer c=new Consumer(vm);
     
	       Thread t1=new Thread(p, "������");
	       Thread t2=new Thread(c, "�Һ���");
	 
	       t1.start();
	       t2.start();
=============================================     
[���ȭ��]
������ : ����� No. 1 ���Ǳ⿡ �ֱ�
�Һ��� : ����� No. 1 ��������
 
������ : ����� No. 2 ���Ǳ⿡ �ֱ�
�Һ��� : ����� No. 2 ��������

������ : ����� No. 3 ���Ǳ⿡ �ֱ�
�Һ��� : ����� No. 3 ��������
        :
        
������ : ����� No. 10 ���Ǳ⿡ �ֱ�
�Һ��� : ����� No. 10 �������� 
*/

public class VendingMachine {
	Stack store=new Stack(); 
	
	//For coustomer(�Һ�)
	public synchronized String getDrink(){
		while(store.isEmpty())
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
		}
		return store.pop().toString();
	}
	
	//For producer(����)
	public synchronized void putDrink(String drink){
		notify();
		store.push(drink);
	}	
}