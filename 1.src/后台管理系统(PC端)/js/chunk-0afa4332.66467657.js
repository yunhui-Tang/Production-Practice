(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-0afa4332"],{c851:function(e,t,a){"use strict";a.r(t);var l=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("a-spin",{attrs:{spinning:e.confirmLoading}},[a("j-form-container",{attrs:{disabled:e.formDisabled}},[a("a-form-model",{ref:"form",attrs:{slot:"detail",model:e.model,rules:e.validatorRules},slot:"detail"},[a("a-row",[a("a-col",{attrs:{span:24}},[a("a-form-model-item",{attrs:{label:"水站账号",labelCol:e.labelCol,wrapperCol:e.wrapperCol,prop:"username"}},[a("a-input",{attrs:{placeholder:"请输入水站账号"},model:{value:e.model.username,callback:function(t){e.$set(e.model,"username",t)},expression:"model.username"}})],1)],1),a("a-col",{attrs:{span:24}},[a("a-form-model-item",{attrs:{label:"水站密码",labelCol:e.labelCol,wrapperCol:e.wrapperCol,prop:"password"}},[a("a-input",{attrs:{placeholder:"请输入水站密码"},model:{value:e.model.password,callback:function(t){e.$set(e.model,"password",t)},expression:"model.password"}})],1)],1),a("a-col",{attrs:{span:24}},[a("a-form-model-item",{attrs:{label:"水站名称",labelCol:e.labelCol,wrapperCol:e.wrapperCol,prop:"name"}},[a("a-input",{attrs:{placeholder:"请输入水站名称"},model:{value:e.model.name,callback:function(t){e.$set(e.model,"name",t)},expression:"model.name"}})],1)],1),a("a-col",{attrs:{span:24}},[a("a-form-model-item",{attrs:{label:"水站图片",labelCol:e.labelCol,wrapperCol:e.wrapperCol,prop:"image"}},[a("j-image-upload",{attrs:{isMultiple:""},model:{value:e.model.image,callback:function(t){e.$set(e.model,"image",t)},expression:"model.image"}})],1)],1),a("a-col",{attrs:{span:24}},[a("a-form-model-item",{attrs:{label:"水站描述",labelCol:e.labelCol,wrapperCol:e.wrapperCol,prop:"descr"}},[a("a-textarea",{attrs:{rows:"4",placeholder:"请输入水站描述"},model:{value:e.model.descr,callback:function(t){e.$set(e.model,"descr",t)},expression:"model.descr"}})],1)],1),a("a-col",{attrs:{span:24}},[a("a-form-model-item",{attrs:{label:"水站地址",labelCol:e.labelCol,wrapperCol:e.wrapperCol,prop:"address"}},[a("a-input",{attrs:{placeholder:"请输入水站地址"},model:{value:e.model.address,callback:function(t){e.$set(e.model,"address",t)},expression:"model.address"}})],1)],1),a("a-col",{attrs:{span:24}},[a("a-form-model-item",{attrs:{label:"加盟或直销",labelCol:e.labelCol,wrapperCol:e.wrapperCol,prop:"joinDirect"}},[a("j-dict-select-tag",{attrs:{type:"list",dictCode:"join_direct",placeholder:"请选择加盟或直销"},model:{value:e.model.joinDirect,callback:function(t){e.$set(e.model,"joinDirect",t)},expression:"model.joinDirect"}})],1)],1),a("a-col",{attrs:{span:24}},[a("a-form-model-item",{attrs:{label:"押金",labelCol:e.labelCol,wrapperCol:e.wrapperCol,prop:"deposit"}},[a("a-input-number",{staticStyle:{width:"100%"},attrs:{placeholder:"请输入押金"},model:{value:e.model.deposit,callback:function(t){e.$set(e.model,"deposit",t)},expression:"model.deposit"}})],1)],1),a("a-col",{attrs:{span:24}},[a("a-form-model-item",{attrs:{label:"分润比例",labelCol:e.labelCol,wrapperCol:e.wrapperCol,prop:"profitSharingRatio"}},[a("a-input-number",{staticStyle:{width:"100%"},attrs:{placeholder:"请输入分润比例"},model:{value:e.model.profitSharingRatio,callback:function(t){e.$set(e.model,"profitSharingRatio",t)},expression:"model.profitSharingRatio"}})],1)],1)],1)],1)],1),a("a-tabs",{on:{change:e.handleChangeTabs},model:{value:e.activeKey,callback:function(t){e.activeKey=t},expression:"activeKey"}},[a("a-tab-pane",{key:e.refKeys[0],attrs:{tab:"水站周报",forceRender:!0}},[a("j-vxe-table",{ref:e.refKeys[0],attrs:{"keep-source":"",loading:e.xwWaterStationWeeklyTable.loading,columns:e.xwWaterStationWeeklyTable.columns,dataSource:e.xwWaterStationWeeklyTable.dataSource,maxHeight:300,disabled:e.formDisabled,rowNumber:!0,rowSelection:!0,toolbar:!0}})],1),a("a-tab-pane",{key:e.refKeys[1],attrs:{tab:"水站月报",forceRender:!0}},[a("j-vxe-table",{ref:e.refKeys[1],attrs:{"keep-source":"",loading:e.xwWaterStationMonthlyTable.loading,columns:e.xwWaterStationMonthlyTable.columns,dataSource:e.xwWaterStationMonthlyTable.dataSource,maxHeight:300,disabled:e.formDisabled,rowNumber:!0,rowSelection:!0,toolbar:!0}})],1),a("a-tab-pane",{key:e.refKeys[2],attrs:{tab:"送水工",forceRender:!0}},[a("j-vxe-table",{ref:e.refKeys[2],attrs:{"keep-source":"",loading:e.xwDeliveryerTable.loading,columns:e.xwDeliveryerTable.columns,dataSource:e.xwDeliveryerTable.dataSource,maxHeight:300,disabled:e.formDisabled,rowNumber:!0,rowSelection:!0,toolbar:!0}})],1),a("a-tab-pane",{key:e.refKeys[3],attrs:{tab:"水站商品中间表",forceRender:!0}},[a("j-vxe-table",{ref:e.refKeys[3],attrs:{"keep-source":"",loading:e.xwWaterStationGoodTable.loading,columns:e.xwWaterStationGoodTable.columns,dataSource:e.xwWaterStationGoodTable.dataSource,maxHeight:300,disabled:e.formDisabled,rowNumber:!0,rowSelection:!0,toolbar:!0}})],1)],1)],1)},o=[],r=(a("0fea"),a("f335")),i=a("2475"),n=a("54ac"),s=(a("ca00"),a("c681"));function d(e,t){var a=Object.keys(e);if(Object.getOwnPropertySymbols){var l=Object.getOwnPropertySymbols(e);t&&(l=l.filter((function(t){return Object.getOwnPropertyDescriptor(e,t).enumerable}))),a.push.apply(a,l)}return a}function u(e){for(var t=1;t<arguments.length;t++){var a=null!=arguments[t]?arguments[t]:{};t%2?d(Object(a),!0).forEach((function(t){c(e,t,a[t])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(a)):d(Object(a)).forEach((function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(a,t))}))}return e}function c(e,t,a){return t in e?Object.defineProperty(e,t,{value:a,enumerable:!0,configurable:!0,writable:!0}):e[t]=a,e}var p={name:"XwWaterStationForm",mixins:[r["a"]],components:{JFormContainer:s["default"]},data:function(){return{labelCol:{xs:{span:24},sm:{span:5}},wrapperCol:{xs:{span:24},sm:{span:16}},model:{},addDefaultRowNum:1,validatorRules:{},refKeys:["xwWaterStationWeekly","xwWaterStationMonthly","xwDeliveryer","xwWaterStationGood"],tableKeys:["xwWaterStationWeekly","xwWaterStationMonthly","xwDeliveryer","xwWaterStationGood"],activeKey:"xwWaterStationWeekly",xwWaterStationWeeklyTable:{loading:!1,dataSource:[],columns:[{title:"总营收",key:"totalRevenue",type:i["b"].input,width:"200px",placeholder:"请输入${title}",defaultValue:""},{title:"分润金额",key:"profitDistriAmount",type:i["b"].input,width:"200px",placeholder:"请输入${title}",defaultValue:""},{title:"销售量",key:"sales",type:i["b"].input,width:"200px",placeholder:"请输入${title}",defaultValue:""},{title:"报表时间",key:"reportTime",type:i["b"].date,width:"200px",placeholder:"请输入${title}",defaultValue:""},{title:"第几周",key:"week",type:i["b"].input,width:"200px",placeholder:"请输入${title}",defaultValue:""}]},xwWaterStationMonthlyTable:{loading:!1,dataSource:[],columns:[{title:"总营收",key:"totalRevenue",type:i["b"].input,width:"200px",placeholder:"请输入${title}",defaultValue:""},{title:"分润金额",key:"profitDistriAmount",type:i["b"].input,width:"200px",placeholder:"请输入${title}",defaultValue:""},{title:"销售量",key:"sales",type:i["b"].input,width:"200px",placeholder:"请输入${title}",defaultValue:""},{title:"报表时间",key:"reportTime",type:i["b"].input,width:"200px",placeholder:"请输入${title}",defaultValue:""},{title:"月份",key:"month",type:i["b"].input,width:"200px",placeholder:"请输入${title}",defaultValue:""}]},xwDeliveryerTable:{loading:!1,dataSource:[],columns:[{title:"用户名",key:"username",type:i["b"].input,width:"200px",placeholder:"请输入${title}",defaultValue:""},{title:"密码",key:"password",type:i["b"].input,width:"200px",placeholder:"请输入${title}",defaultValue:""},{title:"图片",key:"image",type:i["b"].input,width:"200px",placeholder:"请输入${title}",defaultValue:""},{title:"性别",key:"sex",type:i["b"].input,width:"200px",placeholder:"请输入${title}",defaultValue:""},{title:"年龄",key:"age",type:i["b"].input,width:"200px",placeholder:"请输入${title}",defaultValue:""},{title:"电话号码",key:"phoneNumber",type:i["b"].input,width:"200px",placeholder:"请输入${title}",defaultValue:""},{title:"水站id",key:"waterStationId",type:i["b"].input,width:"200px",placeholder:"请输入${title}",defaultValue:""}]},xwWaterStationGoodTable:{loading:!1,dataSource:[],columns:[{title:"商品名称",key:"goodName",type:i["b"].input,width:"200px",placeholder:"请输入${title}",defaultValue:""},{title:"上架商品数量",key:"amount",type:i["b"].input,width:"200px",placeholder:"请输入${title}",defaultValue:""},{title:"水站id",key:"waterStationId",type:i["b"].input,width:"200px",placeholder:"请输入${title}",defaultValue:""}]},url:{add:"/waterstation/xwWaterStation/add",edit:"/waterstation/xwWaterStation/edit",queryById:"/waterstation/xwWaterStation/queryById",xwWaterStationWeekly:{list:"/waterstation/xwWaterStation/queryXwWaterStationWeeklyByMainId"},xwWaterStationMonthly:{list:"/waterstation/xwWaterStation/queryXwWaterStationMonthlyByMainId"},xwDeliveryer:{list:"/waterstation/xwWaterStation/queryXwDeliveryerByMainId"},xwWaterStationGood:{list:"/waterstation/xwWaterStation/queryXwWaterStationGoodByMainId"}}}},props:{disabled:{type:Boolean,default:!1,required:!1}},computed:{formDisabled:function(){return this.disabled}},created:function(){},methods:{addBefore:function(){this.xwWaterStationWeeklyTable.dataSource=[],this.xwWaterStationMonthlyTable.dataSource=[],this.xwDeliveryerTable.dataSource=[],this.xwWaterStationGoodTable.dataSource=[]},getAllTable:function(){var e=this,t=this.tableKeys.map((function(t){return Object(n["c"])(e,t)}));return Promise.all(t)},editAfter:function(){if(this.$nextTick((function(){})),this.model.id){var e={id:this.model.id};this.requestSubTableData(this.url.xwWaterStationWeekly.list,e,this.xwWaterStationWeeklyTable),this.requestSubTableData(this.url.xwWaterStationMonthly.list,e,this.xwWaterStationMonthlyTable),this.requestSubTableData(this.url.xwDeliveryer.list,e,this.xwDeliveryerTable),this.requestSubTableData(this.url.xwWaterStationGood.list,e,this.xwWaterStationGoodTable)}},validateSubForm:function(e){var t=this;return new Promise((function(a,l){Promise.all([]).then((function(){a(e)})).catch((function(e){e.error===n["a"]&&(t.activeKey=null==e.index?t.activeKey:t.refKeys[e.index])}))}))},classifyIntoFormData:function(e){var t=Object.assign(this.model,e.formValue);return u(u({},t),{},{xwWaterStationWeeklyList:e.tablesValue[0].tableData,xwWaterStationMonthlyList:e.tablesValue[1].tableData,xwDeliveryerList:e.tablesValue[2].tableData,xwWaterStationGoodList:e.tablesValue[3].tableData})},validateError:function(e){this.$message.error(e)}}},f=p,b=a("2877"),m=Object(b["a"])(f,l,o,!1,null,"2d77f321",null);t["default"]=m.exports},f335:function(e,t,a){"use strict";a.d(t,"a",(function(){return r}));var l=a("54ac"),o=a("0fea"),r={data:function(){return{title:"操作",visible:!1,confirmLoading:!1,scrolling:!0,model:{},labelCol:{xs:{span:24},sm:{span:6}},wrapperCol:{xs:{span:24},sm:{span:18}}}},methods:{getAllTable:function(){var e=this;if(!(this.refKeys instanceof Array))throw this.throwNotArray("refKeys");var t=this.refKeys.map((function(t){return Object(l["c"])(e,t)}));return Promise.all(t)},eachAllTable:function(e){this.getAllTable().then((function(t){t.forEach((function(t,a){"function"===typeof e&&e(t,a)}))}))},add:function(){"function"===typeof this.addBefore&&this.addBefore();var e=this.addDefaultRowNum;"number"!==typeof e&&(e=1),this.eachAllTable((function(e){setTimeout((function(){e.addRows()}),30)})),"function"===typeof this.addAfter&&this.addAfter(this.model),this.edit(this.model)},edit:function(e){"function"===typeof this.editBefore&&this.editBefore(e),this.visible=!0,this.activeKey=this.refKeys[0],this.$refs.form.resetFields(),this.model=Object.assign({},e),"function"===typeof this.editAfter&&this.editAfter(this.model)},close:function(){this.visible=!1,this.eachAllTable((function(e){e._remove()})),this.$emit("close")},requestSubTableData:function(e,t,a,l){a.loading=!0,Object(o["c"])(e,t).then((function(e){var t=e.result,o=[];t&&(Array.isArray(t)?o=t:Array.isArray(t.records)&&(o=t.records)),a.dataSource=o,"function"===typeof l&&l(e)})).finally((function(){a.loading=!1}))},request:function(e){var t=this,a=this.url.add,l="post";this.model.id&&(a=this.url.edit,l="put"),this.confirmLoading=!0,Object(o["h"])(a,e,l).then((function(e){e.success?(t.$message.success(e.message),t.$emit("ok"),t.close()):t.$message.warning(e.message)})).finally((function(){t.confirmLoading=!1}))},handleChangeTabs:function(e){Object(l["c"])(this,e).then((function(e){e.resetScrollTop()}))},handleCancel:function(){this.close()},handleOk:function(){var e=this;this.getAllTable().then((function(t){return Object(l["d"])(e.$refs.form,e.model,t)})).then((function(t){return e.validateSubForm(t)})).then((function(t){if("function"!==typeof e.classifyIntoFormData)throw e.throwNotFunction("classifyIntoFormData");var a=e.classifyIntoFormData(t);return e.request(a)})).catch((function(t){t.error===l["a"]&&(e.activeKey=null==t.index?e.activeKey:e.refKeys[t.index])}))},validateSubForm:function(e){return new Promise((function(t){t(e)}))},throwNotFunction:function(e){return"".concat(e," 未定义或不是一个函数")},throwNotArray:function(e){return"".concat(e," 未定义或不是一个数组")}}}}}]);