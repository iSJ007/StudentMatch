public class Student {

	
	private String name; 
	private char gender;
	private Date birthdate;
	private Preference pref;
	private Boolean matched = false ; 
	public int cScore;
	
	
	public Student (String name, char gender, Date birthdate, Preference pref ) {
		this.name= name;
		this.gender=gender;
		this.birthdate=birthdate;
		this.pref=pref;
	}
	 public void setMatch (Boolean matched) {
		 this.matched= matched;
		 }
	 public String getName() {
			 return this.name; 
		} 
		public char getGender() {
			return this.gender;
		}
		public Boolean getMatch() {
			return matched;
		}
		public Date getBirthday() {
			return this.birthdate;
		}
		public Preference getPreference() {
			return this.pref;
		}
	public int compare (Student st) {
		if(gender != st.gender) {
			return 0;
		}
		
		int cScore = (40 - pref.compare(st.pref))
			+ (60 - birthdate.compare(st.birthdate));
		
		
		if (cScore < 0) {
			return 0;
		} else if (cScore > 100) {
			return 100;
		}
		return cScore; 
	}
} 



