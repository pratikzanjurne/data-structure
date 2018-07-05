package banking;

public class Logic {
	
	public static final int DEFAULT_SIZE=10;
	
	private int data[];
	private int cash;
	private int size=0;
	
	public Logic(){
		data=new int[DEFAULT_SIZE];
	}
	
	public boolean isEmpty(){
		return size==0;
	}
	
	public void enqueue(int obj) throws Exception{
		if(size==DEFAULT_SIZE-1){
			throw new Exception("Queue is full. Dequeue some objects");
		}
		this.data[size]=obj;
		this.size++;
	}
	
	public void dequeue() throws Exception{
		if(isEmpty())throw new Exception("Queue is empty");
		this.data[0]=0;
		for(int i =0; i<this.size-1; i++){
			data[i]=data[i+1];
		}
		this.cash=cash;
		this.size--;
		
		
	}
	public void display()
	{
		int cash2=0;
		for(int i=0;i<this.size;i++)
		{
			
			cash2=cash2+this.data[i];
		}
		System.out.println("available balance is:"+cash2);
			
	}

	public int getSize() {
		
		return this.size;
	}
}