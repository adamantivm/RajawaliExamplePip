package com.ekumen.rajawaliexamplepip;

import android.graphics.Color;

import org.rajawali3d.Object3D;
import org.rajawali3d.materials.Material;
import org.rajawali3d.primitives.Sphere;
import org.rajawali3d.renderer.RajawaliRenderer;
import org.rajawali3d.renderer.pip.SubRenderer;

/**
 * Created by Julian Cerruti <jcerruti@creativa77.com> on 8/19/15.
 */
public class MiniRenderer extends SubRenderer {

    public MiniRenderer(RajawaliRenderer renderer) {
        super(renderer);
    }

    @Override
    public void initScene() {
        getCurrentScene().setBackgroundColor(Color.GRAY);

        Object3D o = new Sphere(1, 10, 10);
        o.setMaterial(new Material());
        o.setColor(Color.RED);
        o.setPosition(-1, 0, 0);
        getCurrentScene().addChild(o);

        o = new Sphere(1, 10, 10);
        o.setMaterial(new Material());
        o.setColor(Color.GREEN);
        o.setPosition(0, 0, 0);
        getCurrentScene().addChild(o);

        o = new Sphere(1, 10, 10);
        o.setMaterial(new Material());
        o.setColor(Color.BLUE);
        o.setPosition(1, 0, 0);
        getCurrentScene().addChild(o);
    }

    @Override
    protected void onRender() {

    }
}
