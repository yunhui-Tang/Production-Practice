// pages/login/index.js
Page({
    handleGetUserInfo(e){
      //  console.log(e);
      const {userInfo}=e.detail;
      wx-wx.setStorageSync('userinfo', userInfo);
      wx-wx.navigateBack({
        delta: 1,
      });
    }
})