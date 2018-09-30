package wdx.cr.quizz;

import android.graphics.Typeface;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

class MainActivity extends AppCompatActivity {

    private SoundPool mySound;
    private static int[] arr = new int[51];
    private int qn = 1;
    private TextView textView3, textView6, textView7, textView8, textView9;
    private int sound, sound2;
    private ImageView imageView7;
    private ImageButton btn1, btn2, btn3, btn4;
    private ProgressBar progress;
    private String data[][]=WordBase.base();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.q1);
        getSupportActionBar().hide();
        btn1 = (ImageButton) findViewById(R.id.btn1);
        btn2 = (ImageButton) findViewById(R.id.btn2);
        btn3 = (ImageButton) findViewById(R.id.btn3);
        btn4 = (ImageButton) findViewById(R.id.btn4);
        textView3 = (TextView) findViewById(R.id.textView3);
        imageView7 = (ImageView) findViewById(R.id.imageView7);
        textView6 = (TextView) findViewById(R.id.textView6);
        textView7 = (TextView) findViewById(R.id.textView7);
        textView8 = (TextView) findViewById(R.id.textView8);
        textView9 = (TextView) findViewById(R.id.textView9);
        progress = (ProgressBar) findViewById(R.id.progress);

        mySound = new SoundPool(5, AudioManager.STREAM_MUSIC, 1);
        sound = mySound.load(this, R.raw.butt02, 1);
        sound2 = mySound.load(this, R.raw.jingle2, 1);

        Typeface tf = Typeface.createFromAsset(getAssets(),"font/supercell.ttf");
        textView6.setTypeface(tf);
        textView7.setTypeface(tf);
        textView8.setTypeface(tf);
        textView9.setTypeface(tf);
        textView3.setTypeface(tf);



        mySound.setOnLoadCompleteListener(new
                                                  SoundPool.OnLoadCompleteListener() {
                                                      @Override
                                                      public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
                                                          mySound.play(sound2, 1, 1, 1, 0, 1);
                                                      }
                                                  });


    }


    public void btn1(View viev) {
        //textView7
        int button=1;
        if (qn == 1) {
            setScore(0);
            setScore(0);
            question2();
        }
        if (qn == 2) {
            setScore(2);
            question3();
        }
        if (qn == 3) {
            setScore(3);
            question4();
        }
        if (qn == 4) {
            setScore(1);
            question5();
        }
        if (qn == 5) {
            setScore(1);
            question6();
        }
        if (qn == 6) {
            setScore(1);
            question7();
        }
        if (qn == 7) {
            setScore(1);
            setScore(1);
            question8();
        }
        mySound.play(sound, 1, 1, 1, 0, 1);
        qn++;
    }


    public void btn2(View viev) {
        //textView6
        if (qn == 1) {
            question2();
        }
        if (qn == 2) {
            setScore(0);
            question3();
        }
        if (qn == 3) {
            setScore(1);
            question4();
        }
        if (qn == 4) {
            setScore(0);
            question5();
        }
        if (qn == 5) {
            setScore(0);
            question6();
        }
        if (qn == 6) {
            setScore(0);
            question7();
        }
        if (qn == 7) {
            setScore(3);
            question8();
        }
        mySound.play(sound, 1, 1, 1, 0, 1);
        qn++;
    }

    public void btn3(View viev) {
        //textView9
        if (qn == 1) {
            setScore(1);
            setScore(1);
            question2();
        }
        if (qn == 2) {
            setScore(3);
            question3();
        }
        if (qn == 3) {
            setScore(2);
            question4();
        }
        if (qn == 4) {
            setScore(3);
            question5();
        }
        if (qn == 5) {
            setScore(3);
            question6();
        }
        if (qn == 6) {
            setScore(2);
            question7();
        }
        if (qn == 7) {
            setScore(0);
            question8();
        }
        if (qn == 100) {
            restart();
        }
        mySound.play(sound, 1, 1, 1, 0, 1);
        qn++;
    }

    public void btn4(View viev) {
        //textView8
        if (qn == 1) {
            setScore(0);
            question2();
        }
        if (qn == 2) {
            setScore(1);
            question3();
        }
        if (qn == 3) {
            setScore(0);
            question4();
        }
        if (qn == 4) {
            setScore(2);
            question5();
        }
        if (qn == 5) {
            setScore(2);
            question6();
        }
        if (qn == 6) {
            setScore(3);
            question7();
        }
        if (qn == 7) {
            setScore(2);
            question8();
        }
        mySound.play(sound, 1, 1, 1, 0, 1);
        qn++;
    }

    private void question2() {

        textView3.setText("Какое оружие самое сильное?");
        int resID = imageView7.getContext().getResources().getIdentifier("qw2", "drawable", imageView7.getContext().getPackageName());
        imageView7.setImageResource(resID);
        textView6.setText("Меч Экскалибур ");
        textView7.setText("АК-47");
        textView8.setText("В магии сила, брат");
        textView9.setText("Я сам оружие!");
        progress(1);
    }

    private void question3() {

        textView3.setText("Какой магией ты бы владел если б мог?");
        int resID = imageView7.getContext().getResources().getIdentifier("qw3", "drawable", imageView7.getContext().getPackageName());
        imageView7.setImageResource(resID);
        textView6.setText("Повелевал бы огнем");
        textView7.setText("Темной магией");
        textView8.setText("Магия света");
        textView9.setText("Лед или молнии");
        progress(2);
    }

    private void question4() {

        textView3.setText("Как победить врага?");
        int resID = imageView7.getContext().getResources().getIdentifier("qw4", "drawable", imageView7.getContext().getPackageName());
        imageView7.setImageResource(resID);
        textView6.setText("Налететь толпой вояк ");
        textView7.setText("Могучей силой мозгов");
        textView8.setText("Я и так непобедимый!");
        textView9.setText("Донатить как проклятый");
        progress(3);
    }

    private void question5() {

        textView3.setText("Кто победит в схватке?");
        int resID = imageView7.getContext().getResources().getIdentifier("qw5", "drawable", imageView7.getContext().getPackageName());
        imageView7.setImageResource(resID);
        textView6.setText("Зверюга бешенная");
        textView7.setText("Человек разумный");
        textView8.setText("Механизм военный");
        textView9.setText("Нежить бездушная");
        progress(4);
    }

    private void question6() {

        textView3.setText("Как ты ставишь жизненные цели?");
        int resID = imageView7.getContext().getResources().getIdentifier("qw6", "drawable", imageView7.getContext().getPackageName());
        imageView7.setImageResource(resID);
        textView6.setText("План дня у меня есть");
        textView7.setText("У меня одна цель!");
        textView8.setText("Просто что-то делаю");
        textView9.setText("У меня цели как у всех");
        progress(5);
    }

    private void question7() {
        textView3.setText("Что для тебя важнее?");
        int resID = imageView7.getContext().getResources().getIdentifier("qw7", "drawable", imageView7.getContext().getPackageName());
        imageView7.setImageResource(resID);
        textView6.setText("Мне нужна власть!");
        textView7.setText("Деньги, остальное куплю");
        textView8.setText("Главное саморазвитие");
        textView9.setText("Всего по немногу");
        progress(6);

    }

    private void question8() {
        report();
    }


    private void report() {
        String name = data[WordBase.maxScore(arr)][0];
        String accuracy = WordBase.resAccuracy(arr);
        int j = WordBase.maxScore(arr);
        String kart = ("k");
        kart = (kart + String.valueOf(j));
        textView3.setText("Поздравляю ты \n" + name + "! \nСовпадение: " + accuracy);
        int resID = imageView7.getContext().getResources().getIdentifier(kart, "drawable", imageView7.getContext().getPackageName());
        imageView7.setImageResource(resID);
        textView6.setVisibility(View.INVISIBLE);
        textView7.setVisibility(View.INVISIBLE);
        btn1.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);
        progress.setVisibility(ProgressBar.INVISIBLE);
        int resID1 = btn3.getContext().getResources().getIdentifier("butt2", "drawable", btn3.getContext().getPackageName());
        btn3.setImageResource(resID1);
        textView9.setText("Попробуем снова?");
        textView8.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);
        qn = 99;
    }

    private void progress(int v) {
        int amountQuestions = 7;
        int b = (100 / amountQuestions) * v;
        progress.setProgress(b);

    }

    private void restart() {
        for (int i = 0; i < 51; i++) arr[i] = 0;
        textView3.setText("Ты боишься высоты?");
        int resID = imageView7.getContext().getResources().getIdentifier("qw1", "drawable", imageView7.getContext().getPackageName());
        imageView7.setImageResource(resID);
        textView6.setText("Ничего не боюсь");
        textView7.setText("Не проверял");
        textView8.setText("Больше чем скелетов");
        textView9.setText("Я летун!");
        textView6.setVisibility(View.VISIBLE);
        textView7.setVisibility(View.VISIBLE);
        textView8.setVisibility(View.VISIBLE);
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn4.setVisibility(View.VISIBLE);
        int resID1 = btn3.getContext().getResources().getIdentifier("butt", "drawable", btn3.getContext().getPackageName());
        btn3.setImageResource(resID1);
        progress.setVisibility(ProgressBar.VISIBLE);
        progress(0);
        qn = 1;
    }



    private void setScore(int t) {
        for (int i = 0; i < arr.length; i++)
            if (data[i][qn].equals(String.valueOf(t))) arr[i]++;
    }

}