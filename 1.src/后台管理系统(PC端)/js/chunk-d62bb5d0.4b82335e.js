(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-d62bb5d0","chunk-2d225d87","chunk-2d0dec69"],{"13b1":function(e,t,a){},"86a6":function(e,t,a){"use strict";a.r(t);var s=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("a-modal",{attrs:{title:e.title,width:800,visible:e.visible,confirmLoading:e.confirmLoading,cancelText:"关闭"},on:{ok:e.handleOk,cancel:e.handleCancel}},[a("a-spin",{attrs:{spinning:e.confirmLoading}},[a("a-form",[a("a-form-item",{attrs:{labelCol:e.labelCol,wrapperCol:e.wrapperCol,label:"模板标题"}},[a("a-input",{attrs:{disabled:""},model:{value:e.templateName,callback:function(t){e.templateName=t},expression:"templateName"}})],1),a("a-form-item",{attrs:{labelCol:e.labelCol,wrapperCol:e.wrapperCol,label:"模板内容"}},[a("a-textarea",{attrs:{disabled:"",autosize:{minRows:5,maxRows:8}},model:{value:e.templateContent,callback:function(t){e.templateContent=t},expression:"templateContent"}})],1),a("a-form-item",{attrs:{labelCol:e.labelCol,wrapperCol:e.wrapperCol,label:"测试数据"}},[a("a-textarea",{attrs:{placeholder:"请输入json格式测试数据",autosize:{minRows:5,maxRows:8}},model:{value:e.testData,callback:function(t){e.testData=t},expression:"testData"}})],1),a("a-form-item",{attrs:{labelCol:e.labelCol,wrapperCol:e.wrapperCol,label:"消息类型"}},[a("j-dict-select-tag",{attrs:{type:"radio",placeholder:"请选择消息类型",dictCode:"messageType"},model:{value:e.msgType,callback:function(t){e.msgType=t},expression:"msgType"}})],1),a("a-form-item",{attrs:{labelCol:e.labelCol,wrapperCol:e.wrapperCol,label:"消息接收方"}},[a("j-select-user-by-dep",{attrs:{placeholder:"请选择消息接收方"},model:{value:e.receiver,callback:function(t){e.receiver=t},expression:"receiver"}})],1)],1)],1)],1)},l=[],o=a("0fea"),r=a("c14a"),n={name:"SysMessageTestModal",components:{JSelectUserByDep:r["default"]},data:function(){return{title:"操作",visible:!1,model:{},labelCol:{xs:{span:24},sm:{span:5}},wrapperCol:{xs:{span:24},sm:{span:16}},confirmLoading:!1,url:{send:"/sys/message/sysMessageTemplate/sendMsg"},templateName:"",templateContent:"",receiver:"",msgType:"system",testData:"",sendParams:{}}},methods:{open:function(e){this.sendParams.templateCode=e.templateCode,this.templateName=e.templateName,this.templateContent=e.templateContent,this.testData=e.templateTestJson,this.visible=!0},close:function(){this.receiver="",this.msgType="system",this.sendParams={},this.visible=!1},handleOk:function(){var e=this,t=this.url.send,a="post";this.sendParams.testData=this.testData,this.sendParams.receiver=this.receiver,this.sendParams.msgType=this.msgType,Object(o["h"])(t,this.sendParams,a).then((function(t){t.success?e.$message.success(t.message):e.$message.warning(t.message)})).finally((function(){e.confirmLoading=!1,e.close()}))},handleCancel:function(){this.close()}}},i=n,m=a("2877"),c=Object(m["a"])(i,s,l,!1,null,"617841f1",null);t["default"]=c.exports},e3c3:function(e,t,a){"use strict";var s=a("13b1"),l=a.n(s);l.a},e5ab:function(e,t,a){"use strict";a.r(t);var s=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("a-modal",{attrs:{title:e.title,width:800,visible:e.visible,confirmLoading:e.confirmLoading,cancelText:"关闭"},on:{ok:e.handleOk,cancel:e.handleCancel}},[a("a-spin",{attrs:{spinning:e.confirmLoading}},[a("a-form",{attrs:{form:e.form}},[a("a-row",{attrs:{gutter:{xs:8,sm:16,md:24,lg:32}}},[a("a-col",{attrs:{span:12}},[a("a-form-item",{staticStyle:{"margin-right":"-35px"},attrs:{labelCol:e.labelCol,wrapperCol:e.wrapperCol,label:"模板CODE"}},[a("a-input",{directives:[{name:"decorator",rawName:"v-decorator",value:["templateCode",e.validatorRules.templateCode],expression:"['templateCode', validatorRules.templateCode ]"}],attrs:{disabled:e.disable,placeholder:"请输入模板编码"}})],1)],1),a("a-col",{attrs:{span:12}},[a("a-form-item",{attrs:{labelCol:e.labelCol,wrapperCol:e.wrapperCol,label:"模板类型"}},[a("j-dict-select-tag",{directives:[{name:"decorator",rawName:"v-decorator",value:["templateType",e.validatorRules.templateType],expression:"['templateType', validatorRules.templateType ]"}],attrs:{triggerChange:!0,dictCode:"msgType",placeholder:"请选择模板类型"},on:{change:e.handleChangeTemplateType}})],1)],1)],1),a("a-row",{staticClass:"form-row",attrs:{gutter:24}},[a("a-col",{attrs:{span:24,pull:"2"}},[a("a-form-item",{staticStyle:{"margin-left":"-15px"},attrs:{labelCol:e.labelCol,wrapperCol:e.wrapperCol,label:"模板标题"}},[a("a-input",{directives:[{name:"decorator",rawName:"v-decorator",value:["templateName",e.validatorRules.templateName],expression:"['templateName', validatorRules.templateName]"}],staticStyle:{width:"122%"},attrs:{placeholder:"请输入模板标题"}})],1)],1)],1),a("a-row",{staticClass:"form-row",attrs:{gutter:24}},[a("a-col",{attrs:{span:24,pull:"2"}},[a("a-form-item",{staticStyle:{"margin-left":"-15px"},attrs:{labelCol:e.labelCol,wrapperCol:e.wrapperCol,label:"是否应用"}},[a("j-switch",{directives:[{name:"decorator",rawName:"v-decorator",value:["useStatus",e.validatorRules.useStatus],expression:"['useStatus', validatorRules.useStatus]"}],attrs:{options:["1","0"]}})],1)],1)],1),a("a-row",{staticClass:"form-row",attrs:{gutter:24}},[a("a-col",{attrs:{span:24,pull:"4"}},[a("a-form-item",{directives:[{name:"show",rawName:"v-show",value:!e.useEditor,expression:"!useEditor"}],staticStyle:{"margin-left":"4px",width:"126%"},attrs:{labelCol:e.labelCol,wrapperCol:e.wrapperCol,label:"模板内容"}},[a("a-textarea",{directives:[{name:"decorator",rawName:"v-decorator",value:["templateContent",e.validatorRules.templateContent],expression:"['templateContent', validatorRules.templateContent ]"}],attrs:{placeholder:"请输入模板内容",autosize:{minRows:8,maxRows:8}}})],1)],1)],1),a("a-row",{staticClass:"form-row",attrs:{gutter:24}},[a("a-col",{attrs:{span:24,pull:"4"}},[a("a-form-item",{directives:[{name:"show",rawName:"v-show",value:e.useEditor,expression:"useEditor"}],staticStyle:{"margin-left":"4px",width:"126%"},attrs:{labelCol:e.labelCol,wrapperCol:e.wrapperCol,label:"模板内容"}},[a("j-editor",{model:{value:e.templateEditorContent,callback:function(t){e.templateEditorContent=t},expression:"templateEditorContent"}})],1)],1)],1)],1)],1)],1)},l=[],o=a("0fea"),r=a("88bc"),n=a.n(r),i=a("4ec3"),m=a("a061"),c=a("f92c"),d={name:"SysMessageTemplateModal",components:{JEditor:m["default"],JSwitch:c["default"]},data:function(){return{title:"操作",visible:!1,disable:!0,model:{},labelCol:{xs:{span:24},sm:{span:5}},wrapperCol:{xs:{span:24},sm:{span:16}},confirmLoading:!1,form:this.$form.createForm(this),validatorRules:{templateCode:{rules:[{required:!0,message:"请输入模板CODE!"},{validator:this.validateTemplateCode}]},templateName:{rules:[{required:!0,message:"请输入模板标题!"}]},templateContent:{rules:[]},useStatus:{rules:[]},templateType:{rules:[{required:!0,message:"请输入模板类型!"}]}},url:{add:"/sys/message/sysMessageTemplate/add",edit:"/sys/message/sysMessageTemplate/edit"},useEditor:!1,templateEditorContent:""}},created:function(){},methods:{add:function(){this.disable=!1,this.edit({})},edit:function(e){var t=this;this.form.resetFields(),this.model=Object.assign({},e),this.useEditor=2==e.templateType||4==e.templateType,this.useEditor?this.templateEditorContent=e.templateContent:this.templateEditorContent="",this.visible=!0,this.$nextTick((function(){t.useEditor?t.form.setFieldsValue(n()(t.model,"useStatus","templateCode","templateName","templateTestJson","templateType")):t.form.setFieldsValue(n()(t.model,"useStatus","templateCode","templateContent","templateName","templateTestJson","templateType"))}))},close:function(){this.$emit("close"),this.visible=!1,this.disable=!0},handleOk:function(){var e=this;this.model.templateType=this.templateType;var t=this;this.form.validateFields((function(a,s){if(!a){t.confirmLoading=!0;var l="",r="";e.model.id?(l+=e.url.edit,r="put"):(l+=e.url.add,r="post");var n=Object.assign(e.model,s);e.useEditor&&(n.templateContent=e.templateEditorContent),Object(o["h"])(l,n,r).then((function(e){e.success?(t.$message.success(e.message),t.$emit("ok")):t.$message.warning(e.message)})).finally((function(){t.confirmLoading=!1,t.close()}))}}))},validateTemplateCode:function(e,t,a){var s={tableName:"sys_sms_template",fieldName:"template_code",fieldVal:t,dataId:this.model.id};Object(i["m"])(s).then((function(e){e.success?a():a(e.message)}))},handleCancel:function(){this.close()},handleChangeTemplateType:function(e){this.useEditor=2==e||4==e}}},p=d,u=a("2877"),f=Object(u["a"])(p,s,l,!1,null,"51a812cd",null);t["default"]=f.exports},fd15:function(e,t,a){"use strict";a.r(t);var s=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("a-card",{attrs:{bordered:!1}},[a("div",{staticClass:"table-page-search-wrapper"},[a("a-form",{attrs:{layout:"inline"},nativeOn:{keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.searchQuery(t)}}},[a("a-row",{attrs:{gutter:24}},[a("a-col",{attrs:{md:6,sm:8}},[a("a-form-item",{attrs:{label:"模板CODE"}},[a("a-input",{attrs:{placeholder:"请输入模板CODE"},model:{value:e.queryParam.templateCode,callback:function(t){e.$set(e.queryParam,"templateCode",t)},expression:"queryParam.templateCode"}})],1)],1),a("a-col",{attrs:{md:6,sm:8}},[a("a-form-item",{attrs:{label:"模板内容"}},[a("a-input",{attrs:{placeholder:"请输入模板内容"},model:{value:e.queryParam.templateContent,callback:function(t){e.$set(e.queryParam,"templateContent",t)},expression:"queryParam.templateContent"}})],1)],1),e.toggleSearchStatus?[a("a-col",{attrs:{md:6,sm:8}},[a("a-form-item",{attrs:{label:"模板标题"}},[a("a-input",{attrs:{placeholder:"请输入模板标题"},model:{value:e.queryParam.templateName,callback:function(t){e.$set(e.queryParam,"templateName",t)},expression:"queryParam.templateName"}})],1)],1),a("a-col",{attrs:{md:6,sm:8}},[a("a-form-item",{attrs:{label:"模板类型"}},[a("j-dict-select-tag",{attrs:{placeholder:"请选择模板类型",dictCode:"msgType"},model:{value:e.queryParam.templateType,callback:function(t){e.$set(e.queryParam,"templateType",t)},expression:"queryParam.templateType"}})],1)],1)]:e._e(),a("a-col",{attrs:{md:6,sm:8}},[a("span",{staticClass:"table-page-search-submitButtons",staticStyle:{float:"left",overflow:"hidden"}},[a("a-button",{attrs:{type:"primary",icon:"search"},on:{click:e.searchQuery}},[e._v("查询")]),a("a-button",{staticStyle:{"margin-left":"8px"},attrs:{type:"primary",icon:"reload"},on:{click:e.searchReset}},[e._v("重置")]),a("a",{staticStyle:{"margin-left":"8px"},on:{click:e.handleToggleSearch}},[e._v("\n                "+e._s(e.toggleSearchStatus?"收起":"展开")+"\n                "),a("a-icon",{attrs:{type:e.toggleSearchStatus?"up":"down"}})],1)],1)])],2)],1)],1),a("div",{staticClass:"table-operator"},[a("a-button",{attrs:{type:"primary",icon:"plus"},on:{click:e.handleAdd}},[e._v("新增")]),a("a-button",{attrs:{type:"primary",icon:"download"},on:{click:function(t){return e.handleExportXls("消息模板")}}},[e._v("导出")]),a("a-upload",{attrs:{name:"file",showUploadList:!1,multiple:!1,headers:e.tokenHeader,action:e.importExcelUrl},on:{change:e.handleImportExcel}},[a("a-button",{attrs:{type:"primary",icon:"import"}},[e._v("导入")])],1)],1),a("div",[a("div",{staticClass:"ant-alert ant-alert-info",staticStyle:{"margin-bottom":"16px"}},[a("i",{staticClass:"anticon anticon-info-circle ant-alert-icon"}),e._v(" 已选择 "),a("a",{staticStyle:{"font-weight":"600"}},[e._v(e._s(e.selectedRowKeys.length))]),e._v("项\n        "),a("a",{staticStyle:{"margin-left":"24px"},on:{click:e.onClearSelected}},[e._v("清空")])]),a("a-table",{ref:"table",attrs:{size:"middle",bordered:"",rowKey:"id",columns:e.columns,dataSource:e.dataSource,pagination:e.ipagination,loading:e.loading,rowSelection:{selectedRowKeys:e.selectedRowKeys,onChange:e.onSelectChange}},on:{change:e.handleTableChange},scopedSlots:e._u([{key:"templateContent",fn:function(e){return a("span",{},[a("j-ellipsis",{attrs:{value:e,length:25}})],1)}},{key:"action",fn:function(t,s){return a("span",{},[a("a",{on:{click:function(t){return e.handleMyEdit(s)}}},[e._v("编辑")]),a("a-divider",{attrs:{type:"vertical"}}),a("a-dropdown",[a("a",{staticClass:"ant-dropdown-link"},[e._v("更多 "),a("a-icon",{attrs:{type:"down"}})],1),a("a-menu",{attrs:{slot:"overlay"},slot:"overlay"},[a("a-menu-item",[a("a",{on:{click:function(t){return e.handleUse(s)}}},[e._v("应用")])]),a("a-menu-item",[a("a",{on:{click:function(t){return e.handleNotUse(s)}}},[e._v("停用")])]),a("a-menu-item",[a("a-popconfirm",{attrs:{title:"确定删除吗?"},on:{confirm:function(){return e.handleDelete(s)}}},[a("a",[e._v("删除")])])],1),a("a-menu-item",[a("a",{on:{click:function(t){return e.handleTest(s)}}},[e._v("发送测试")])])],1)],1)],1)}}])})],1),a("sysMessageTemplate-modal",{ref:"modalForm",on:{ok:e.modalFormOk}}),a("sysMessageTest-modal",{ref:"testModal"})],1)},l=[],o=a("e5ab"),r=a("86a6"),n=a("b65a"),i=a("d579"),m=a("0fea"),c=a("7b16"),d={name:"SysMessageTemplateList",mixins:[n["a"]],components:{JEllipsis:i["default"],SysMessageTemplateModal:o["default"],SysMessageTestModal:r["default"],JDictSelectTag:c["default"]},data:function(){return{description:"消息模板管理页面",columns:[{title:"#",dataIndex:"",key:"rowIndex",width:60,align:"center",customRender:function(e,t,a){return parseInt(a)+1}},{title:"模板CODE",align:"center",dataIndex:"templateCode"},{title:"模板标题",align:"center",dataIndex:"templateName"},{title:"模板内容",align:"center",dataIndex:"templateContent",scopedSlots:{customRender:"templateContent"}},{title:"模板类型",align:"center",dataIndex:"templateType",customRender:function(e){return"1"==e?"文本":"2"==e?"富文本":void 0}},{title:"是否应用",align:"center",dataIndex:"useStatus",customRender:function(e){return"1"==e?"是":"否"}},{title:"操作",dataIndex:"action",align:"center",scopedSlots:{customRender:"action"}}],url:{list:"/sys/message/sysMessageTemplate/list",delete:"/sys/message/sysMessageTemplate/delete",deleteBatch:"/sys/message/sysMessageTemplate/deleteBatch",exportXlsUrl:"sys/message/sysMessageTemplate/exportXls",importExcelUrl:"sys/message/sysMessageTemplate/importExcel"}}},computed:{importExcelUrl:function(){return"".concat(window._CONFIG["domianURL"],"/").concat(this.url.importExcelUrl)}},methods:{handleTest:function(e){this.$refs.testModal.open(e),this.$refs.testModal.title="发送测试"},updateUseStatus:function(e,t){var a=this,s={id:e.id,useStatus:t};Object(m["h"])("/sys/message/sysMessageTemplate/edit",s,"put").then((function(e){e.success?a.$message.success(e.message):a.$message.warning(e.message)})).finally((function(){a.loadData()}))},handleUse:function(e){this.updateUseStatus(e,"1")},handleNotUse:function(e){this.updateUseStatus(e,"0")},handleMyEdit:function(e){"1"==e.useStatus?this.$message.warning("此模板已被应用，禁止编辑!"):this.handleEdit(e)},handleDelete:function(e){if(this.url.delete)if("1"!=e.useStatus){var t=e.id,a=this;Object(m["a"])(a.url.delete,{id:t}).then((function(e){e.success?(a.reCalculatePage(1),a.$message.success(e.message),a.loadData()):a.$message.warning(e.message)}))}else this.$message.error("该模板已被应用禁止删除!");else this.$message.error("请设置url.delete属性!")}}},p=d,u=(a("e3c3"),a("2877")),f=Object(u["a"])(p,s,l,!1,null,"02d1d4e0",null);t["default"]=f.exports}}]);