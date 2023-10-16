package com.kh.demo1.test;

@Slf4j
public class LocalTest {
  @Test
  void local(){
    Locale[] locales = Locale.getAvailableLocales();
    for (Locale locale : locales){
      log.info("locale={}", locale);
    }
  }
}
