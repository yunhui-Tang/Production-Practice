(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-58359b10","chunk-62f11cd7","chunk-0afa4332"],{"415c":function(e,t,a){"use strict";a.r(t);var l=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("a-card",{attrs:{bordered:!1}},[a("div",{staticClass:"table-page-search-wrapper"},[a("a-form",{attrs:{layout:"inline"},nativeOn:{keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.searchQuery(t)}}},[a("a-row",{attrs:{gutter:24}})],1)],1),a("div",{staticClass:"table-operator"},[a("a-button",{attrs:{type:"primary",icon:"plus"},on:{click:e.handleAdd}},[e._v("新增")]),a("a-button",{attrs:{type:"primary",icon:"download"},on:{click:function(t){return e.handleExportXls("水站")}}},[e._v("导出")]),a("a-upload",{attrs:{name:"file",showUploadList:!1,multiple:!1,headers:e.tokenHeader,action:e.importExcelUrl},on:{change:e.handleImportExcel}},[a("a-button",{attrs:{type:"primary",icon:"import"}},[e._v("导入")])],1),a("j-super-query",{ref:"superQueryModal",attrs:{fieldList:e.superFieldList},on:{handleSuperQuery:e.handleSuperQuery}}),e.selectedRowKeys.length>0?a("a-dropdown",[a("a-menu",{attrs:{slot:"overlay"},slot:"overlay"},[a("a-menu-item",{key:"1",on:{click:e.batchDel}},[a("a-icon",{attrs:{type:"delete"}}),e._v("删除")],1)],1),a("a-button",{staticStyle:{"margin-left":"8px"}},[e._v(" 批量操作 "),a("a-icon",{attrs:{type:"down"}})],1)],1):e._e()],1),a("div",[a("div",{staticClass:"ant-alert ant-alert-info",staticStyle:{"margin-bottom":"16px"}},[a("i",{staticClass:"anticon anticon-info-circle ant-alert-icon"}),e._v(" 已选择 "),a("a",{staticStyle:{"font-weight":"600"}},[e._v(e._s(e.selectedRowKeys.length))]),e._v("项\n      "),a("a",{staticStyle:{"margin-left":"24px"},on:{click:e.onClearSelected}},[e._v("清空")])]),a("a-table",{ref:"table",staticClass:"j-table-force-nowrap",attrs:{size:"middle",bordered:"",rowKey:"id",scroll:{x:!0},columns:e.columns,dataSource:e.dataSource,pagination:e.ipagination,loading:e.loading,rowSelection:{selectedRowKeys:e.selectedRowKeys,onChange:e.onSelectChange}},on:{change:e.handleTableChange},scopedSlots:e._u([{key:"htmlSlot",fn:function(t){return[a("div",{domProps:{innerHTML:e._s(t)}})]}},{key:"imgSlot",fn:function(t,l){return[t?a("img",{staticStyle:{"max-width":"80px","font-size":"12px","font-style":"italic"},attrs:{src:e.getImgView(t),preview:l.id,height:"25px",alt:""}}):a("span",{staticStyle:{"font-size":"12px","font-style":"italic"}},[e._v("无图片")])]}},{key:"fileSlot",fn:function(t){return[t?a("a-button",{attrs:{ghost:!0,type:"primary",icon:"download",size:"small"},on:{click:function(a){return e.downloadFile(t)}}},[e._v("\n          下载\n        ")]):a("span",{staticStyle:{"font-size":"12px","font-style":"italic"}},[e._v("无文件")])]}},{key:"action",fn:function(t,l){return a("span",{},[a("a",{on:{click:function(t){return e.handleEdit(l)}}},[e._v("编辑")]),a("a-divider",{attrs:{type:"vertical"}}),a("a-dropdown",[a("a",{staticClass:"ant-dropdown-link"},[e._v("更多 "),a("a-icon",{attrs:{type:"down"}})],1),a("a-menu",{attrs:{slot:"overlay"},slot:"overlay"},[a("a-menu-item",[a("a",{on:{click:function(t){return e.handleDetail(l)}}},[e._v("详情")])]),a("a-menu-item",[a("a-popconfirm",{attrs:{title:"确定删除吗?"},on:{confirm:function(){return e.handleDelete(l.id)}}},[a("a",[e._v("删除")])])],1)],1)],1)],1)}}])})],1),a("xw-water-station-modal",{ref:"modalForm",on:{ok:e.modalFormOk}})],1)},i=[],o=a("b65a"),r=a("d35e"),n=(a("89f2"),a("6eb7"),{name:"XwWaterStationList",mixins:[o["a"]],components:{XwWaterStationModal:r["default"]},data:function(){return{description:"水站管理页面",columns:[{title:"#",dataIndex:"",key:"rowIndex",width:60,align:"center",customRender:function(e,t,a){return parseInt(a)+1}},{title:"水站账号",align:"center",dataIndex:"username"},{title:"水站密码",align:"center",dataIndex:"password"},{title:"水站名称",align:"center",dataIndex:"name"},{title:"水站图片",align:"center",dataIndex:"image",scopedSlots:{customRender:"imgSlot"}},{title:"水站描述",align:"center",dataIndex:"descr"},{title:"水站地址",align:"center",dataIndex:"address"},{title:"加盟或直销",align:"center",dataIndex:"joinDirect_dictText"},{title:"押金",align:"center",dataIndex:"deposit"},{title:"分润比例",align:"center",dataIndex:"profitSharingRatio"},{title:"操作",dataIndex:"action",align:"center",fixed:"right",width:147,scopedSlots:{customRender:"action"}}],url:{list:"/waterstation/xwWaterStation/list",delete:"/waterstation/xwWaterStation/delete",deleteBatch:"/waterstation/xwWaterStation/deleteBatch",exportXlsUrl:"/waterstation/xwWaterStation/exportXls",importExcelUrl:"waterstation/xwWaterStation/importExcel"},dictOptions:{},superFieldList:[]}},created:function(){this.getSuperFieldList()},computed:{importExcelUrl:function(){return"".concat(window._CONFIG["domianURL"],"/").concat(this.url.importExcelUrl)}},methods:{initDictConfig:function(){},getSuperFieldList:function(){var e=[];e.push({type:"string",value:"username",text:"水站账号",dictCode:""}),e.push({type:"string",value:"password",text:"水站密码",dictCode:""}),e.push({type:"string",value:"name",text:"水站名称",dictCode:""}),e.push({type:"string",value:"image",text:"水站图片",dictCode:""}),e.push({type:"Text",value:"descr",text:"水站描述",dictCode:""}),e.push({type:"string",value:"address",text:"水站地址",dictCode:""}),e.push({type:"int",value:"joinDirect",text:"加盟或直销",dictCode:"join_direct"}),e.push({type:"double",value:"deposit",text:"押金",dictCode:""}),e.push({type:"double",value:"profitSharingRatio",text:"分润比例",dictCode:""}),this.superFieldList=e}}}),s=n,d=(a("4c5b"),a("2877")),c=Object(d["a"])(s,l,i,!1,null,"00051056",null);t["default"]=c.exports},"4c5b":function(e,t,a){"use strict";var l=a("5d8b"),i=a.n(l);i.a},"5d8b":function(e,t,a){},"6eb7":function(e,t,a){},c851:function(e,t,a){"use strict";a.r(t);var l=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("a-spin",{attrs:{spinning:e.confirmLoading}},[a("j-form-container",{attrs:{disabled:e.formDisabled}},[a("a-form-model",{ref:"form",attrs:{slot:"detail",model:e.model,rules:e.validatorRules},slot:"detail"},[a("a-row",[a("a-col",{attrs:{span:24}},[a("a-form-model-item",{attrs:{label:"水站账号",labelCol:e.labelCol,wrapperCol:e.wrapperCol,prop:"username"}},[a("a-input",{attrs:{placeholder:"请输入水站账号"},model:{value:e.model.username,callback:function(t){e.$set(e.model,"username",t)},expression:"model.username"}})],1)],1),a("a-col",{attrs:{span:24}},[a("a-form-model-item",{attrs:{label:"水站密码",labelCol:e.labelCol,wrapperCol:e.wrapperCol,prop:"password"}},[a("a-input",{attrs:{placeholder:"请输入水站密码"},model:{value:e.model.password,callback:function(t){e.$set(e.model,"password",t)},expression:"model.password"}})],1)],1),a("a-col",{attrs:{span:24}},[a("a-form-model-item",{attrs:{label:"水站名称",labelCol:e.labelCol,wrapperCol:e.wrapperCol,prop:"name"}},[a("a-input",{attrs:{placeholder:"请输入水站名称"},model:{value:e.model.name,callback:function(t){e.$set(e.model,"name",t)},expression:"model.name"}})],1)],1),a("a-col",{attrs:{span:24}},[a("a-form-model-item",{attrs:{label:"水站图片",labelCol:e.labelCol,wrapperCol:e.wrapperCol,prop:"image"}},[a("j-image-upload",{attrs:{isMultiple:""},model:{value:e.model.image,callback:function(t){e.$set(e.model,"image",t)},expression:"model.image"}})],1)],1),a("a-col",{attrs:{span:24}},[a("a-form-model-item",{attrs:{label:"水站描述",labelCol:e.labelCol,wrapperCol:e.wrapperCol,prop:"descr"}},[a("a-textarea",{attrs:{rows:"4",placeholder:"请输入水站描述"},model:{value:e.model.descr,callback:function(t){e.$set(e.model,"descr",t)},expression:"model.descr"}})],1)],1),a("a-col",{attrs:{span:24}},[a("a-form-model-item",{attrs:{label:"水站地址",labelCol:e.labelCol,wrapperCol:e.wrapperCol,prop:"address"}},[a("a-input",{attrs:{placeholder:"请输入水站地址"},model:{value:e.model.address,callback:function(t){e.$set(e.model,"address",t)},expression:"model.address"}})],1)],1),a("a-col",{attrs:{span:24}},[a("a-form-model-item",{attrs:{label:"加盟或直销",labelCol:e.labelCol,wrapperCol:e.wrapperCol,prop:"joinDirect"}},[a("j-dict-select-tag",{attrs:{type:"list",dictCode:"join_direct",placeholder:"请选择加盟或直销"},model:{value:e.model.joinDirect,callback:function(t){e.$set(e.model,"joinDirect",t)},expression:"model.joinDirect"}})],1)],1),a("a-col",{attrs:{span:24}},[a("a-form-model-item",{attrs:{label:"押金",labelCol:e.labelCol,wrapperCol:e.wrapperCol,prop:"deposit"}},[a("a-input-number",{staticStyle:{width:"100%"},attrs:{placeholder:"请输入押金"},model:{value:e.model.deposit,callback:function(t){e.$set(e.model,"deposit",t)},expression:"model.deposit"}})],1)],1),a("a-col",{attrs:{span:24}},[a("a-form-model-item",{attrs:{label:"分润比例",labelCol:e.labelCol,wrapperCol:e.wrapperCol,prop:"profitSharingRatio"}},[a("a-input-number",{staticStyle:{width:"100%"},attrs:{placeholder:"请输入分润比例"},model:{value:e.model.profitSharingRatio,callback:function(t){e.$set(e.model,"profitSharingRatio",t)},expression:"model.profitSharingRatio"}})],1)],1)],1)],1)],1),a("a-tabs",{on:{change:e.handleChangeTabs},model:{value:e.activeKey,callback:function(t){e.activeKey=t},expression:"activeKey"}},[a("a-tab-pane",{key:e.refKeys[0],attrs:{tab:"水站周报",forceRender:!0}},[a("j-vxe-table",{ref:e.refKeys[0],attrs:{"keep-source":"",loading:e.xwWaterStationWeeklyTable.loading,columns:e.xwWaterStationWeeklyTable.columns,dataSource:e.xwWaterStationWeeklyTable.dataSource,maxHeight:300,disabled:e.formDisabled,rowNumber:!0,rowSelection:!0,toolbar:!0}})],1),a("a-tab-pane",{key:e.refKeys[1],attrs:{tab:"水站月报",forceRender:!0}},[a("j-vxe-table",{ref:e.refKeys[1],attrs:{"keep-source":"",loading:e.xwWaterStationMonthlyTable.loading,columns:e.xwWaterStationMonthlyTable.columns,dataSource:e.xwWaterStationMonthlyTable.dataSource,maxHeight:300,disabled:e.formDisabled,rowNumber:!0,rowSelection:!0,toolbar:!0}})],1),a("a-tab-pane",{key:e.refKeys[2],attrs:{tab:"送水工",forceRender:!0}},[a("j-vxe-table",{ref:e.refKeys[2],attrs:{"keep-source":"",loading:e.xwDeliveryerTable.loading,columns:e.xwDeliveryerTable.columns,dataSource:e.xwDeliveryerTable.dataSource,maxHeight:300,disabled:e.formDisabled,rowNumber:!0,rowSelection:!0,toolbar:!0}})],1),a("a-tab-pane",{key:e.refKeys[3],attrs:{tab:"水站商品中间表",forceRender:!0}},[a("j-vxe-table",{ref:e.refKeys[3],attrs:{"keep-source":"",loading:e.xwWaterStationGoodTable.loading,columns:e.xwWaterStationGoodTable.columns,dataSource:e.xwWaterStationGoodTable.dataSource,maxHeight:300,disabled:e.formDisabled,rowNumber:!0,rowSelection:!0,toolbar:!0}})],1)],1)],1)},i=[],o=(a("0fea"),a("f335")),r=a("2475"),n=a("54ac"),s=(a("ca00"),a("c681"));function d(e,t){var a=Object.keys(e);if(Object.getOwnPropertySymbols){var l=Object.getOwnPropertySymbols(e);t&&(l=l.filter((function(t){return Object.getOwnPropertyDescriptor(e,t).enumerable}))),a.push.apply(a,l)}return a}function c(e){for(var t=1;t<arguments.length;t++){var a=null!=arguments[t]?arguments[t]:{};t%2?d(Object(a),!0).forEach((function(t){u(e,t,a[t])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(a)):d(Object(a)).forEach((function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(a,t))}))}return e}function u(e,t,a){return t in e?Object.defineProperty(e,t,{value:a,enumerable:!0,configurable:!0,writable:!0}):e[t]=a,e}var p={name:"XwWaterStationForm",mixins:[o["a"]],components:{JFormContainer:s["default"]},data:function(){return{labelCol:{xs:{span:24},sm:{span:5}},wrapperCol:{xs:{span:24},sm:{span:16}},model:{},addDefaultRowNum:1,validatorRules:{},refKeys:["xwWaterStationWeekly","xwWaterStationMonthly","xwDeliveryer","xwWaterStationGood"],tableKeys:["xwWaterStationWeekly","xwWaterStationMonthly","xwDeliveryer","xwWaterStationGood"],activeKey:"xwWaterStationWeekly",xwWaterStationWeeklyTable:{loading:!1,dataSource:[],columns:[{title:"总营收",key:"totalRevenue",type:r["b"].input,width:"200px",placeholder:"请输入${title}",defaultValue:""},{title:"分润金额",key:"profitDistriAmount",type:r["b"].input,width:"200px",placeholder:"请输入${title}",defaultValue:""},{title:"销售量",key:"sales",type:r["b"].input,width:"200px",placeholder:"请输入${title}",defaultValue:""},{title:"报表时间",key:"reportTime",type:r["b"].date,width:"200px",placeholder:"请输入${title}",defaultValue:""},{title:"第几周",key:"week",type:r["b"].input,width:"200px",placeholder:"请输入${title}",defaultValue:""}]},xwWaterStationMonthlyTable:{loading:!1,dataSource:[],columns:[{title:"总营收",key:"totalRevenue",type:r["b"].input,width:"200px",placeholder:"请输入${title}",defaultValue:""},{title:"分润金额",key:"profitDistriAmount",type:r["b"].input,width:"200px",placeholder:"请输入${title}",defaultValue:""},{title:"销售量",key:"sales",type:r["b"].input,width:"200px",placeholder:"请输入${title}",defaultValue:""},{title:"报表时间",key:"reportTime",type:r["b"].input,width:"200px",placeholder:"请输入${title}",defaultValue:""},{title:"月份",key:"month",type:r["b"].input,width:"200px",placeholder:"请输入${title}",defaultValue:""}]},xwDeliveryerTable:{loading:!1,dataSource:[],columns:[{title:"用户名",key:"username",type:r["b"].input,width:"200px",placeholder:"请输入${title}",defaultValue:""},{title:"密码",key:"password",type:r["b"].input,width:"200px",placeholder:"请输入${title}",defaultValue:""},{title:"图片",key:"image",type:r["b"].input,width:"200px",placeholder:"请输入${title}",defaultValue:""},{title:"性别",key:"sex",type:r["b"].input,width:"200px",placeholder:"请输入${title}",defaultValue:""},{title:"年龄",key:"age",type:r["b"].input,width:"200px",placeholder:"请输入${title}",defaultValue:""},{title:"电话号码",key:"phoneNumber",type:r["b"].input,width:"200px",placeholder:"请输入${title}",defaultValue:""},{title:"水站id",key:"waterStationId",type:r["b"].input,width:"200px",placeholder:"请输入${title}",defaultValue:""}]},xwWaterStationGoodTable:{loading:!1,dataSource:[],columns:[{title:"商品名称",key:"goodName",type:r["b"].input,width:"200px",placeholder:"请输入${title}",defaultValue:""},{title:"上架商品数量",key:"amount",type:r["b"].input,width:"200px",placeholder:"请输入${title}",defaultValue:""},{title:"水站id",key:"waterStationId",type:r["b"].input,width:"200px",placeholder:"请输入${title}",defaultValue:""}]},url:{add:"/waterstation/xwWaterStation/add",edit:"/waterstation/xwWaterStation/edit",queryById:"/waterstation/xwWaterStation/queryById",xwWaterStationWeekly:{list:"/waterstation/xwWaterStation/queryXwWaterStationWeeklyByMainId"},xwWaterStationMonthly:{list:"/waterstation/xwWaterStation/queryXwWaterStationMonthlyByMainId"},xwDeliveryer:{list:"/waterstation/xwWaterStation/queryXwDeliveryerByMainId"},xwWaterStationGood:{list:"/waterstation/xwWaterStation/queryXwWaterStationGoodByMainId"}}}},props:{disabled:{type:Boolean,default:!1,required:!1}},computed:{formDisabled:function(){return this.disabled}},created:function(){},methods:{addBefore:function(){this.xwWaterStationWeeklyTable.dataSource=[],this.xwWaterStationMonthlyTable.dataSource=[],this.xwDeliveryerTable.dataSource=[],this.xwWaterStationGoodTable.dataSource=[]},getAllTable:function(){var e=this,t=this.tableKeys.map((function(t){return Object(n["c"])(e,t)}));return Promise.all(t)},editAfter:function(){if(this.$nextTick((function(){})),this.model.id){var e={id:this.model.id};this.requestSubTableData(this.url.xwWaterStationWeekly.list,e,this.xwWaterStationWeeklyTable),this.requestSubTableData(this.url.xwWaterStationMonthly.list,e,this.xwWaterStationMonthlyTable),this.requestSubTableData(this.url.xwDeliveryer.list,e,this.xwDeliveryerTable),this.requestSubTableData(this.url.xwWaterStationGood.list,e,this.xwWaterStationGoodTable)}},validateSubForm:function(e){var t=this;return new Promise((function(a,l){Promise.all([]).then((function(){a(e)})).catch((function(e){e.error===n["a"]&&(t.activeKey=null==e.index?t.activeKey:t.refKeys[e.index])}))}))},classifyIntoFormData:function(e){var t=Object.assign(this.model,e.formValue);return c(c({},t),{},{xwWaterStationWeeklyList:e.tablesValue[0].tableData,xwWaterStationMonthlyList:e.tablesValue[1].tableData,xwDeliveryerList:e.tablesValue[2].tableData,xwWaterStationGoodList:e.tablesValue[3].tableData})},validateError:function(e){this.$message.error(e)}}},f=p,m=a("2877"),h=Object(m["a"])(f,l,i,!1,null,"2d77f321",null);t["default"]=h.exports},d35e:function(e,t,a){"use strict";a.r(t);var l=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("j-modal",{attrs:{title:e.title,width:1200,visible:e.visible,maskClosable:!1,switchFullscreen:"",okButtonProps:{class:{"jee-hidden":e.disableSubmit}}},on:{ok:e.handleOk,cancel:e.handleCancel}},[a("xw-water-station-form",{ref:"realForm",attrs:{disabled:e.disableSubmit},on:{ok:e.submitCallback}})],1)},i=[],o=a("c851"),r={name:"XwWaterStationModal",components:{XwWaterStationForm:o["default"]},data:function(){return{title:"",width:800,visible:!1,disableSubmit:!1}},methods:{add:function(){var e=this;this.visible=!0,this.$nextTick((function(){e.$refs.realForm.add()}))},edit:function(e){var t=this;this.visible=!0,this.$nextTick((function(){t.$refs.realForm.edit(e)}))},close:function(){this.$emit("close"),this.visible=!1},handleOk:function(){this.$refs.realForm.handleOk()},submitCallback:function(){this.$emit("ok"),this.visible=!1},handleCancel:function(){this.close()}}},n=r,s=a("2877"),d=Object(s["a"])(n,l,i,!1,null,"33c3a15e",null);t["default"]=d.exports},f335:function(e,t,a){"use strict";a.d(t,"a",(function(){return o}));var l=a("54ac"),i=a("0fea"),o={data:function(){return{title:"操作",visible:!1,confirmLoading:!1,scrolling:!0,model:{},labelCol:{xs:{span:24},sm:{span:6}},wrapperCol:{xs:{span:24},sm:{span:18}}}},methods:{getAllTable:function(){var e=this;if(!(this.refKeys instanceof Array))throw this.throwNotArray("refKeys");var t=this.refKeys.map((function(t){return Object(l["c"])(e,t)}));return Promise.all(t)},eachAllTable:function(e){this.getAllTable().then((function(t){t.forEach((function(t,a){"function"===typeof e&&e(t,a)}))}))},add:function(){"function"===typeof this.addBefore&&this.addBefore();var e=this.addDefaultRowNum;"number"!==typeof e&&(e=1),this.eachAllTable((function(e){setTimeout((function(){e.addRows()}),30)})),"function"===typeof this.addAfter&&this.addAfter(this.model),this.edit(this.model)},edit:function(e){"function"===typeof this.editBefore&&this.editBefore(e),this.visible=!0,this.activeKey=this.refKeys[0],this.$refs.form.resetFields(),this.model=Object.assign({},e),"function"===typeof this.editAfter&&this.editAfter(this.model)},close:function(){this.visible=!1,this.eachAllTable((function(e){e._remove()})),this.$emit("close")},requestSubTableData:function(e,t,a,l){a.loading=!0,Object(i["c"])(e,t).then((function(e){var t=e.result,i=[];t&&(Array.isArray(t)?i=t:Array.isArray(t.records)&&(i=t.records)),a.dataSource=i,"function"===typeof l&&l(e)})).finally((function(){a.loading=!1}))},request:function(e){var t=this,a=this.url.add,l="post";this.model.id&&(a=this.url.edit,l="put"),this.confirmLoading=!0,Object(i["h"])(a,e,l).then((function(e){e.success?(t.$message.success(e.message),t.$emit("ok"),t.close()):t.$message.warning(e.message)})).finally((function(){t.confirmLoading=!1}))},handleChangeTabs:function(e){Object(l["c"])(this,e).then((function(e){e.resetScrollTop()}))},handleCancel:function(){this.close()},handleOk:function(){var e=this;this.getAllTable().then((function(t){return Object(l["d"])(e.$refs.form,e.model,t)})).then((function(t){return e.validateSubForm(t)})).then((function(t){if("function"!==typeof e.classifyIntoFormData)throw e.throwNotFunction("classifyIntoFormData");var a=e.classifyIntoFormData(t);return e.request(a)})).catch((function(t){t.error===l["a"]&&(e.activeKey=null==t.index?e.activeKey:e.refKeys[t.index])}))},validateSubForm:function(e){return new Promise((function(t){t(e)}))},throwNotFunction:function(e){return"".concat(e," 未定义或不是一个函数")},throwNotArray:function(e){return"".concat(e," 未定义或不是一个数组")}}}}}]);