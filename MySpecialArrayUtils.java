
public class MySpecialArrayUtils implements utils {

	public void reverse(int[] arr) {
		for(int i=0;i<(arr.length/2);i++) {
			int temp;
			temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
	}
	public int[] sumEvenOdd(int[] arr) {
		int[] sum=new int[2];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				sum[0]=sum[0]+arr[i];
			}
			else {
				sum[1]=sum[1]+arr[i];
			}
		}
		return sum;
	}
	public double average(int[] arr) {
		double avg=0;
		for(int i=0;i<arr.length;i++) {
			avg=avg+((double)arr[i]/arr.length);
		}
		return avg;
	}
    public void moveValue(int[] arr, int val) {
    	int s=0;
    	int i;
    	for(i=0;i<arr.length-1-s;i++) {
    		if(arr[i]==val) {
    			for(int x=i;x<arr.length-1-s;x++) {
    				arr[x]=arr[x+1];
    			}
    			i--;
    			arr[arr.length-1-s]=val;
    			s++;
    		}
    	}
    }
    public int[][] transpose(int[][] arr) {
    	int[][]trn=new int[arr[0].length][arr.length];
    	if(arr.length!=0) {
    		for(int i=0;i<arr.length;i++) {
    			for(int j=0;j<arr[0].length;j++) {
    				trn[j][i]=arr[i][j];    			
    			}
    		}
    	}
    	return trn;
    }
}
