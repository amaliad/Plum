package id.sch.smktelkom_mlg.project.xiirpl204142434.plum;



import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;


/**
 * A simple {@link Fragment} subclass.
 */
public class communityFragment extends Fragment {
    private TextView mValueView, mCommentView;
    private Button mSendData;
    private Firebase mRef, mCom;
    private EditText mAddComment;

    public communityFragment() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mValueView = (TextView) getActivity().findViewById(R.id.textViewValue);
        mCommentView = (TextView) getActivity().findViewById(R.id.textViewComments);
        mSendData = (Button) getActivity().findViewById(R.id.sendData);
        mAddComment = (EditText) getActivity().findViewById(R.id.editTextComment);
        mRef = new Firebase("https://plum-7cfbc.firebaseio.com/posts");
        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                mValueView.setText(value);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }

        });


        //mSendData.setOnClickListener(new View.OnClickListener() {
        //  @Override
        //  public void onClick(View view) {
        //   Firebase mComChild = mCom.child("comments");
        //    mComChild.setValue(mAddComment.getText().toString());
        // }
        // });
        mCom = new Firebase("https://plum-7cfbc.firebaseio.com/comments");
        mCom.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                mCommentView.setText(value);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_community, container, false);


    }


}
