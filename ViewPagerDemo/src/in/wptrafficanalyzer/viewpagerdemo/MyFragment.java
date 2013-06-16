package in.wptrafficanalyzer.viewpagerdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerTabStrip;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyFragment extends Fragment {

	int mCurrentPage;
	View v;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		/** Getting the arguments to the Bundle object */
		Bundle data = getArguments();

		/** Getting integer data of the key current_page from the bundle */
		mCurrentPage = data.getInt("current_page", 0);

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		switch (mCurrentPage) {

		case 1:
			v = inflater.inflate(R.layout.hotel, container, false);
			break;
		case 2:
			v = inflater.inflate(R.layout.travel, container, false);
			break;
		case 3:
			v = inflater.inflate(R.layout.food, container, false);
			break;
		case 4:
			v = inflater.inflate(R.layout.shop, container, false);
			break;
		case 5:
			v = inflater.inflate(R.layout.taxi, container, false);
			break;
		case 6:
			v = inflater.inflate(R.layout.atm, container, false);
			break;
		default:
			v = inflater.inflate(R.layout.myfragment_layout, container, false);
			TextView tv = (TextView) v.findViewById(R.id.tv);
			tv.setText("You are viewing the page #" + mCurrentPage + "\n\n"
					+ "Swipe Horizontally left / right");
			break;
		}
		return v;
	}
}
