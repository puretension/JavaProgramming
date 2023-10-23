//
//class Emailer {
//    public String generateWeatherAlert(String weatherConditions) {
//        String alert = "[Email] It is " + weatherConditions;
//        return alert;
//    }
//}
//
//class Phone {
//    public String generateWeatherAlert(String weatherConditions) {
//        String alert = "[Alert] It is " + weatherConditions;
//        return alert;
//    }
//}
//
//class SMS{
//	 public String generateWeatherAlert(String weatherConditions) {
//	        String alert = "[SMS] It is " + weatherConditions;
//	        return alert;
//	    }
//}
//
//class WeatherTracker {
//    public String currentConditions;
//    Phone phone;
//    Emailer emailer;
//    SMS sms;
//
//    public WeatherTracker() {
//        phone = new Phone();
//        emailer = new Emailer();
//        sms = new SMS();
//    }
//
//    public void setCurrentConditions(String weatherDescription) {
//        this.currentConditions = weatherDescription;
//        if (weatherDescription == "rainy") {
//            String alert = phone.generateWeatherAlert(weatherDescription);
//            System.out.print(alert);
//        }
//        if (weatherDescription == "sunny") {
//            String alert = emailer.generateWeatherAlert(weatherDescription);
//            System.out.print(alert);
//        }
//        if (weatherDescription == "cloudy") {
//            String alert = sms.generateWeatherAlert(weatherDescription);
//            System.out.print(alert);
//        }
//    }
//}
//
//public class FinalEx5 {
//    public static void main(String[] args) {
//        WeatherTracker weatherTracker = new WeatherTracker();
//        weatherTracker.setCurrentConditions("cloudy");
//    }
//}