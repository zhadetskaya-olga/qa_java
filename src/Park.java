public class Park {

static Attractions[] all_attractions = new Attractions[5];

    class Attractions{

        private String info;
        private String working_hours;
        private String price;

        public Attractions(String info,String working_hours,String price){
            this.info = info;
            this.working_hours = working_hours;
            this.price = price;

        }

    }

}
