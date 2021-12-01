package com.example.form;

import javax.validation.GroupSequence;

//バリデーションの順番を設定、左から順番でバリデーションしていく
@GroupSequence({ ValidGroup1.class, ValidGroup2.class })
public interface GroupOrder {

}
