package wdx.cr.quizz;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Handler;

public class start extends Activity {

    // Время в милесекундах, в течение которого будет отображаться Splash Screen
    SoundPool mySound;
    int sound;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        mySound = new SoundPool(5, AudioManager.STREAM_MUSIC, 1);
        sound = mySound.load(this, R.raw.jingle, 1);

        mySound.setOnLoadCompleteListener(new
                                                  SoundPool.OnLoadCompleteListener() {
                                                      @Override
                                                      public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
                                                          mySound.play(sound,1,1,1,0,1);
                                                      } });



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // По истечении времени, запускаем главный активити, а Splash Screen закрываем
                Intent mainIntent = new Intent(start.this, MainActivity.class);
                start.this.startActivity(mainIntent);
                start.this.finish();
            }
        }, 10);
    }





}

