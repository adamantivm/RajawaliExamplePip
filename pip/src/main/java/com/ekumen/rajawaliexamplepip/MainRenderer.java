package com.ekumen.rajawaliexamplepip;

import android.graphics.Color;

import org.rajawali3d.renderer.RajawaliRenderer;
import org.rajawali3d.renderer.pip.SubRenderer;

/**
 * Created by Julian Cerruti <jcerruti@creativa77.com> on 8/19/15.
 */
public class MainRenderer extends SubRenderer {

    public MainRenderer(RajawaliRenderer renderer) {
        super(renderer);
    }

    @Override
    public void initScene() {
        getCurrentScene().setBackgroundColor(Color.RED);
    }

    @Override
    protected void onRender() {

    }
}
