package CBS.example.opencv_canny;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.opencv.features2d.FeatureDetector;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        FeatureDetector featureDetector = FeatureDetector.create(FeatureDetector.BRISK);
    }
}