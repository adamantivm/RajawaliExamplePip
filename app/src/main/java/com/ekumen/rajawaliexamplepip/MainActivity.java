package com.ekumen.rajawaliexamplepip;

import android.app.Activity;
import android.os.Bundle;

import org.rajawali3d.renderer.pip.RajawaliPipRenderer;
import org.rajawali3d.renderer.pip.SubRenderer;
import org.rajawali3d.surface.RajawaliSurfaceView;

/**
 * Created by Julian Cerruti <jcerruti@creativa77.com> on 8/19/15.
 */
public class MainActivity extends Activity {

    private RajawaliSurfaceView mView;
    private RajawaliPipRenderer mRenderer;

    private SubRenderer mMiniRenderer, mMainRenderer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mView = new RajawaliSurfaceView(this);
        mRenderer = new RajawaliPipRenderer(this, 0.35f, 10, 10);

        mMiniRenderer = new MiniRenderer(mRenderer);
        mRenderer.setMiniRenderer(mMiniRenderer);

        mMainRenderer = new MainRenderer(mRenderer);
        mRenderer.setMainRenderer(mMainRenderer);

        mView.setSurfaceRenderer(mRenderer);
        setContentView(mView);
    }

    @Override
    protected void onPause() {
        super.onPause();
        mView.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mView.onResume();
    }
}
