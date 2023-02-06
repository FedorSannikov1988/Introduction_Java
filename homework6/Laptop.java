package homework6;

public class Laptop {

//--------------
//свойства
    Integer price;
    Integer ramMb;
    Integer sizeHdMb;
    String colorBody;
    String processor;
    String operatingSystem;

//--------------
//консрукторы
    public Laptop() {
                this.price = 0;

                this.ramMb = 0;
                this.sizeHdMb = 0;

                this.colorBody = "";
                this.processor = "";
                this.operatingSystem = "";
    }

    public Laptop(Integer price,     Integer ramMb,    Integer sizeHdMb, 
                   String colorBody, String processor, String operatingSystem) {

                this.price = price;

                this.ramMb = ramMb;
                this.sizeHdMb = sizeHdMb;

                this.colorBody = colorBody;
                this.processor = processor;
                this.operatingSystem = operatingSystem;
    }
//--------------
//переопределение toString()
                @Override
                public String toString() {
                    String outPutFormat = String.format("Prise_Rub: %d RAM_Mb: %d sizeHD_Mb: %d Processor: %s OperatingSystem: %s ColorBody: %s",
                                                        price, ramMb, sizeHdMb, processor, operatingSystem, colorBody);
                    return outPutFormat;
                }
//--------------
//сэттеры
                public void setPriceRub(int price) {
                    this.price = price;
                }

                public void setRamMb(int ramMb) {
                    this.ramMb = ramMb;
                }

                public void setSizeHdMb(int sizeHdMb) {
                    this.sizeHdMb = sizeHdMb;
                }

                public void setProcessor(String processor) {
                    this.processor = processor;
                }

                public void setOperatingSystem(String operatingSystem) {
                    this.operatingSystem = operatingSystem;
                }

                public void setColorBody(String colorBody) {
                    this.colorBody = colorBody;
                }

                public Integer getPriceRub() {
                    return price;
                }
//--------------
//геттеры
                public Integer getRamMb() {
                    return ramMb;
                }

                public Integer getSizeHdMb() {
                    return sizeHdMb;
                }

                public String getProcessor() {
                    return processor;
                }

                public String getOperatingSystem() {
                    return operatingSystem;
                }

                public String getColorBody() {
                    return colorBody;
                }
//--------------
//переопределение equals()
                @Override
                public boolean equals(Object obj) {
                    Laptop forEq = (Laptop) obj;
                    boolean result = (price == forEq.price && 
                                      ramMb == forEq.ramMb && 
                                      sizeHdMb == forEq.sizeHdMb &&
                                      processor == forEq.processor &&
                                      operatingSystem == forEq.operatingSystem &&
                                      colorBody == forEq.colorBody);
                    return result;
                }
//--------------
//переопределение hashCode()
                @Override
                public int hashCode() {

                    int hash = (price +  ramMb +  sizeHdMb +
                    processor.length() + operatingSystem.length() + colorBody.length());

                    return hash ;
                }
}
