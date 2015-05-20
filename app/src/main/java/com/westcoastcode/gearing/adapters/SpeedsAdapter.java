package com.westcoastcode.gearing.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.westcoastcode.gearing.R;
import com.westcoastcode.gearing.model.GearRatios;

/**
 * Created by Jeff on 5/17/2015.
 */
public class SpeedsAdapter  extends RecyclerView.Adapter<SpeedsAdapter.SpeedsHolder>{

    private static final String TAG = "SpeedsAdapter";

    private SpeedAdapterListener mListener;

    public void setListener(SpeedAdapterListener listener){
        mListener = listener;
    }

    private static double[] mRatios = {
            GearRatios.GEAR_273,
            GearRatios.GEAR_308,
            GearRatios.GEAR_331,
            GearRatios.GEAR_354,
            GearRatios.GEAR_373,
            GearRatios.GEAR_411,
            GearRatios.GEAR_456,
            GearRatios.GEAR_488
            };

    @Override
    public SpeedsHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gear_speed, parent, false);
        SpeedsHolder vh = new SpeedsHolder(v);
        vh.gearRatio = (TextView) v.findViewById(R.id.textGear);
        vh.firstGearSpeed = (TextView) v.findViewById(R.id.textFirstSpeed);
        vh.secondGearSpeed = (TextView) v.findViewById(R.id.textSecondSpeed);
        vh.thirdGearSpeed = (TextView) v.findViewById(R.id.textThirdSpeed);
        vh.fourthGearSpeed = (TextView) v.findViewById(R.id.textFourthSpeed);
        vh.fifthGearSpeed = (TextView) v.findViewById(R.id.textFifthSpeed);
        return vh;
    }

    @Override
    public void onBindViewHolder(SpeedsHolder holder, int position) {

        double ratio = mRatios[position];

        double firstGearSpeed = 0;
        double secondGearSpeed = 0;
        double thirdGearSpeed = 0;
        double fourthGearSpeed = 0;
        double fifthGearSpeed = 0;

        if (mListener != null){
            firstGearSpeed = mListener.calcSpeed(ratio, 1);
            secondGearSpeed = mListener.calcSpeed(ratio, 2);
            thirdGearSpeed = mListener.calcSpeed(ratio, 3);
            fourthGearSpeed = mListener.calcSpeed(ratio, 4);
            fifthGearSpeed = mListener.calcSpeed(ratio, 5);
        }

        holder.gearRatio.setText(String.format("%.2f", ratio));
        holder.firstGearSpeed.setText(String.format("%.0f", firstGearSpeed));
        holder.secondGearSpeed.setText(String.format("%.0f", secondGearSpeed));
        holder.thirdGearSpeed.setText(String.format("%.0f", thirdGearSpeed));
        holder.fourthGearSpeed.setText(String.format("%.0f", fourthGearSpeed));
        holder.fifthGearSpeed.setText(String.format("%.0f", fifthGearSpeed));
    }

    @Override
    public int getItemCount() {
        return mRatios.length;
    }

    public static class SpeedsHolder extends RecyclerView.ViewHolder{

        TextView gearRatio;
        TextView firstGearSpeed;
        TextView secondGearSpeed;
        TextView thirdGearSpeed;
        TextView fourthGearSpeed;
        TextView fifthGearSpeed;

        public SpeedsHolder(View itemView) {
            super(itemView);
        }
    }

    public interface SpeedAdapterListener{
        double calcSpeed(double gearRation, int transGear);
    }

}
