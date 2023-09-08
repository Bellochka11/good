package itProger;
// в интерфейсах можно описывать поля и методы но без их реализации поэтому всегда public
public interface ILights { //интерфейс на его основе нельзя создать объекты
    // boolean isOn = false; //фары выключены это поле константа всегда так в интерфейсе!
    void setLight(boolean set);
    void blinkLight(); //помигать фарами
}
