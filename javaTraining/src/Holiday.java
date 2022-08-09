public class Holiday {
        private String name;
        private int day;
        private String month;
        Holiday(String name1,int day1,String month1){
                this.name=name1;
                this.day=day1;
                this.month=month1;
        }
        public boolean isSameMonth(Holiday day1,Holiday day2){
                if(day1.day==day2.day)
                        return true;
                else
                        return false;
        }
        public static double avgDay(Holiday[] day1){
                int sum=0;
                for(int i=0;i<day1.length;i++){
                        sum=sum+day1[i].day;
                }
                return((double)sum/day1.length);
        }
        public static void main(String args[]){
                Holiday object1=new Holiday("Independence day",4,"July");
                Holiday object2=new Holiday("Teachers day",5,"September");
                System.out.println(object1.isSameMonth(object1,object2));
                Holiday[] days=new Holiday[]{object1,object2};
                System.out.println(avgDay(days));
        }

}
