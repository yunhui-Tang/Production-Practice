
export const getSetting=()=>{
return new Promise((resolve,reject)=>{
    wx.getSetting({
  withSubscriptions: true,
  success: (result) => {
      resolve(result);
  },
  fail: (err) => {
      reject(err);
  },
  
});
})
}

export const chooseAddress=()=>{
    return new Promise((resolve,reject)=>{
        wx.chooseAddress({
      withSubscriptions: true,
      success: (result) => {
          resolve(result);
      },
      fail: (err) => {
          reject(err);
      },
      
    });
    })
    }


    export const openSetting=()=>{
        return new Promise((resolve,reject)=>{
            wx.openSetting({
          withSubscriptions: true,
          success: (result) => {
              resolve(result);
          },
          fail: (err) => {
              reject(err);
          },
          
        });
        })
        }