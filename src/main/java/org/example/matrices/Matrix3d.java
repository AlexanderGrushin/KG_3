package org.example.matrices;

import org.example.vectors.Vector3d;

public class Matrix3d extends AbstractSquareMatrix<Matrix3d, Vector3d> {


    public Matrix3d(double[][] data) {
        super(3, data);
    }

    public Matrix3d() {
        super(3);
    }

    @Override
    protected Matrix3d initialReturnThis() {
        return this;
    }

    @Override
    protected Vector3d initialCreateVector(double[] data) {
        return new Vector3d(data);
    }
}
