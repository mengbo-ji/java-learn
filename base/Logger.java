public class Logger {
  private String format;
  public String getFormat() {
    return this.format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public static void main(String[] args) {
    Logger logger = new Logger();
    logger.setFormat("你好");
    System.out.println(logger.format);
  }
}