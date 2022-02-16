#include <Wire.h>
#include <LiquidCrystal_I2C.h>
int ldr = 2;
int buzzer = 3;
int buttonManual = 4;
int buttonDown = 5;
int buttonUp = 6;
int buttonMode = 7;

int ldr_read = 0;
int KWh = 0;
int button_count = 0;

boolean s = false;

LiquidCrystal_I2C lcd(0x27, 16, 2);

void setup() {

  // Serial.begin(9600);
  lcd.begin();
  lcd.backlight();

  pinMode(ldr, INPUT);
  pinMode(buzzer, OUTPUT);
  pinMode(buttonManual, INPUT_PULLUP);
  pinMode(buttonDown, INPUT_PULLUP);
  pinMode(buttonUp, INPUT_PULLUP);
  pinMode(buttonMode, INPUT_PULLUP);

  lcd.clear();
  lcd.setCursor(0, 0);
  lcd.print("Energy Meter 1.0");

}

void loop() {

  if (digitalRead(ldr) == LOW) {
    ldr_read++;
    // Serial.print("Point: ");
    //Serial.println(ldr_read);
    delay(1000);
  }

  if (ldr_read == 20) {
    KWh++;
    // Serial.print("KWh Result: ");
    //Serial.println(KWh);
    ldr_read = 0;
    delay(1000);
  }

  if (digitalRead(buttonMode) == LOW) {
    //Serial.println("Alarm Set Mode");
    lcd.clear();
    lcd.setCursor(0, 0);
    lcd.print("Alarm Set Mode");
    s = true;
    delay(1000);
    while (s) {
      if (digitalRead(buttonUp) == LOW) {
        button_count++;
        lcd.clear();
        lcd.setCursor(0, 0);
        lcd.print("Alarm Set Value");
        lcd.setCursor(0, 1);
        lcd.print(button_count);
        //Serial.print("Alarm Set Value: ");
        //Serial.println(button_count);
        delay(500);
      } else if (digitalRead(buttonDown) == LOW) {
        button_count--;
        lcd.clear();
        lcd.setCursor(0, 0);
        lcd.print("Alarm Set Value");
        lcd.setCursor(0, 1);
        lcd.print(button_count);
        //Serial.print("Alarm Set Value: ");
        //Serial.println(button_count);
        delay(500);
      } else if (digitalRead(buttonMode) == LOW) {
        s = false;
        //Serial.println("Alarm set OK");
        delay(1000);
      }
    }

  } else if (KWh == button_count && KWh != 0) {
    //Serial.println("Alarm ON!!!!!!!!!!!");
    digitalWrite(buzzer, HIGH);
    delay(1000);
    digitalWrite(buzzer, LOW);
    delay(1000);
  }
  if (digitalRead(buttonManual) == LOW) {
    Serial.println(KWh);

    lcd.clear();
    lcd.setCursor(0, 0);
    lcd.print("Serial Data send");
    delay(1000);
    lcd.clear();
    lcd.setCursor(0, 0);
    lcd.print("Energy Meter 1.0");
  }

}
