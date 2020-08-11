class StringCompare{
	public static void main(String[] args){
		String s[]={"hey","you","what","ill","zebra","all","cat","grapes","fish","kite"};
		for(int i=0;i<s.length;i++){
			for(int j=i+1;j<s.length;j++)
				if(s[j].compareTo(s[i])<0){
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
				System.out.println(s[i]);
			}
		}
}

/*

Output:

all
cat
fish
grapes
hey
ill
kite
what
you
zebra


*/

