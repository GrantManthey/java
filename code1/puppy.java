public class Puppy {
	int puppyAge;
	
	public Puppy(String name) {
		
		System.out.println("name chosen is :" + name );
	}
	
	public void setAge( int age ) {
			puppyAge = age;
		}
		
		public int getAge( ) {
			System.out.println("Puppy's age is :"+ puppyAge ); }
			public static void main (String []a) {
				Puppy myPuppy = new Puppy( "tommy" );
				
				myPuppy.setAge( 2 );
				myPuppy.getAge( );
				System.out.println("Variable Value :" + myPuppy.puppyAge);
			}
		}
