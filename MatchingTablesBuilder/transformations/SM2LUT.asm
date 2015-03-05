<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="SM2LUT"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
		<constant value="self"/>
		<constant value="__resolve__"/>
		<constant value="1"/>
		<constant value="J.oclIsKindOf(J):B"/>
		<constant value="18"/>
		<constant value="NTransientLinkSet;.getLinkBySourceElement(S):QNTransientLink;"/>
		<constant value="J.oclIsUndefined():B"/>
		<constant value="15"/>
		<constant value="NTransientLink;.getTargetFromSource(J):J"/>
		<constant value="17"/>
		<constant value="30"/>
		<constant value="Sequence"/>
		<constant value="2"/>
		<constant value="A.__resolve__(J):J"/>
		<constant value="QJ.including(J):QJ"/>
		<constant value="QJ.flatten():QJ"/>
		<constant value="e"/>
		<constant value="value"/>
		<constant value="resolveTemp"/>
		<constant value="S"/>
		<constant value="NTransientLink;.getNamedTargetFromSource(JS):J"/>
		<constant value="name"/>
		<constant value="__matcher__"/>
		<constant value="A.__matchSM2LUT():V"/>
		<constant value="A.__matchT2C():V"/>
		<constant value="__exec__"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applySM2LUT(NTransientLink;):V"/>
		<constant value="T2C"/>
		<constant value="A.__applyT2C(NTransientLink;):V"/>
		<constant value="__matchSM2LUT"/>
		<constant value="StateMachine"/>
		<constant value="MM"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="a"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="b"/>
		<constant value="LookUpTable"/>
		<constant value="MM1"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="11:3-13:4"/>
		<constant value="__applySM2LUT"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="transition"/>
		<constant value="4"/>
		<constant value="event"/>
		<constant value="CJ.including(J):CJ"/>
		<constant value="J.asSet():J"/>
		<constant value="J.createEvent(J):J"/>
		<constant value="12:13-12:14"/>
		<constant value="12:13-12:25"/>
		<constant value="12:39-12:40"/>
		<constant value="12:39-12:46"/>
		<constant value="12:13-12:47"/>
		<constant value="12:13-12:55"/>
		<constant value="12:69-12:79"/>
		<constant value="12:92-12:93"/>
		<constant value="12:69-12:94"/>
		<constant value="12:13-12:95"/>
		<constant value="12:4-12:95"/>
		<constant value="x"/>
		<constant value="link"/>
		<constant value="createEvent"/>
		<constant value="NTransientLinkSet;.getLinkByRuleAndSourceElement(SJ):QNTransientLink;"/>
		<constant value="11"/>
		<constant value="41"/>
		<constant value="Event"/>
		<constant value="21:12-21:13"/>
		<constant value="21:4-21:13"/>
		<constant value="20:3-22:4"/>
		<constant value="__matchT2C"/>
		<constant value="Transition"/>
		<constant value="Change"/>
		<constant value="29:3-34:4"/>
		<constant value="__applyT2C"/>
		<constant value="src"/>
		<constant value="fromState"/>
		<constant value="tgt"/>
		<constant value="toState"/>
		<constant value="J.refImmediateComposite():J"/>
		<constant value="sm"/>
		<constant value="30:17-30:18"/>
		<constant value="30:17-30:22"/>
		<constant value="30:17-30:27"/>
		<constant value="30:4-30:27"/>
		<constant value="31:15-31:16"/>
		<constant value="31:15-31:20"/>
		<constant value="31:15-31:25"/>
		<constant value="31:4-31:25"/>
		<constant value="32:10-32:11"/>
		<constant value="32:10-32:15"/>
		<constant value="32:10-32:39"/>
		<constant value="32:10-32:44"/>
		<constant value="32:4-32:44"/>
		<constant value="33:13-33:23"/>
		<constant value="33:36-33:37"/>
		<constant value="33:36-33:43"/>
		<constant value="33:13-33:44"/>
		<constant value="33:4-33:44"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<operation name="5">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="7"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="9"/>
			<pcall arg="10"/>
			<dup/>
			<push arg="11"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="12"/>
			<pcall arg="10"/>
			<pcall arg="13"/>
			<set arg="3"/>
			<getasm/>
			<push arg="14"/>
			<push arg="8"/>
			<new/>
			<set arg="1"/>
			<getasm/>
			<pcall arg="15"/>
			<getasm/>
			<pcall arg="16"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="24"/>
		</localvariabletable>
	</operation>
	<operation name="18">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
		</parameters>
		<code>
			<load arg="19"/>
			<getasm/>
			<get arg="3"/>
			<call arg="20"/>
			<if arg="21"/>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<dup/>
			<call arg="23"/>
			<if arg="24"/>
			<load arg="19"/>
			<call arg="25"/>
			<goto arg="26"/>
			<pop/>
			<load arg="19"/>
			<goto arg="27"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="19"/>
			<iterate/>
			<store arg="29"/>
			<getasm/>
			<load arg="29"/>
			<call arg="30"/>
			<call arg="31"/>
			<enditerate/>
			<call arg="32"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="33" begin="23" end="27"/>
			<lve slot="0" name="17" begin="0" end="29"/>
			<lve slot="1" name="34" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="35">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
			<parameter name="29" type="36"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<load arg="19"/>
			<load arg="29"/>
			<call arg="37"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="6"/>
			<lve slot="1" name="34" begin="0" end="6"/>
			<lve slot="2" name="38" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="39">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<pcall arg="40"/>
			<getasm/>
			<pcall arg="41"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="3"/>
		</localvariabletable>
	</operation>
	<operation name="42">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="0"/>
			<call arg="43"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="44"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="45"/>
			<call arg="43"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="46"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="33" begin="5" end="8"/>
			<lve slot="1" name="33" begin="15" end="18"/>
			<lve slot="0" name="17" begin="0" end="19"/>
		</localvariabletable>
	</operation>
	<operation name="47">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="48"/>
			<push arg="49"/>
			<findme/>
			<push arg="50"/>
			<call arg="51"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="52"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="0"/>
			<pcall arg="53"/>
			<dup/>
			<push arg="54"/>
			<load arg="19"/>
			<pcall arg="55"/>
			<dup/>
			<push arg="56"/>
			<push arg="57"/>
			<push arg="58"/>
			<new/>
			<pcall arg="59"/>
			<pusht/>
			<pcall arg="60"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="61" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="54" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="62">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="63"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="54"/>
			<call arg="64"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="56"/>
			<call arg="65"/>
			<store arg="66"/>
			<load arg="66"/>
			<dup/>
			<getasm/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="29"/>
			<get arg="67"/>
			<iterate/>
			<store arg="68"/>
			<load arg="68"/>
			<get arg="69"/>
			<call arg="70"/>
			<enditerate/>
			<call arg="71"/>
			<iterate/>
			<store arg="68"/>
			<getasm/>
			<load arg="68"/>
			<call arg="72"/>
			<call arg="70"/>
			<enditerate/>
			<call arg="30"/>
			<set arg="69"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="73" begin="17" end="17"/>
			<lne id="74" begin="17" end="18"/>
			<lne id="75" begin="21" end="21"/>
			<lne id="76" begin="21" end="22"/>
			<lne id="77" begin="14" end="24"/>
			<lne id="78" begin="14" end="25"/>
			<lne id="79" begin="28" end="28"/>
			<lne id="80" begin="29" end="29"/>
			<lne id="81" begin="28" end="30"/>
			<lne id="82" begin="11" end="32"/>
			<lne id="83" begin="9" end="34"/>
			<lne id="61" begin="8" end="35"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="4" name="84" begin="20" end="23"/>
			<lve slot="4" name="84" begin="27" end="31"/>
			<lve slot="3" name="56" begin="7" end="35"/>
			<lve slot="2" name="54" begin="3" end="35"/>
			<lve slot="0" name="17" begin="0" end="35"/>
			<lve slot="1" name="85" begin="0" end="35"/>
		</localvariabletable>
	</operation>
	<operation name="86">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="36"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="86"/>
			<load arg="19"/>
			<call arg="87"/>
			<dup/>
			<call arg="23"/>
			<if arg="88"/>
			<load arg="19"/>
			<call arg="25"/>
			<goto arg="89"/>
			<getasm/>
			<get arg="1"/>
			<push arg="52"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="86"/>
			<pcall arg="53"/>
			<dup/>
			<push arg="54"/>
			<load arg="19"/>
			<pcall arg="55"/>
			<dup/>
			<push arg="56"/>
			<push arg="90"/>
			<push arg="58"/>
			<new/>
			<dup/>
			<store arg="29"/>
			<pcall arg="59"/>
			<pushf/>
			<pcall arg="60"/>
			<load arg="29"/>
			<dup/>
			<getasm/>
			<load arg="19"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
			<load arg="29"/>
		</code>
		<linenumbertable>
			<lne id="91" begin="36" end="36"/>
			<lne id="92" begin="34" end="38"/>
			<lne id="93" begin="33" end="39"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="56" begin="29" end="40"/>
			<lve slot="0" name="17" begin="0" end="40"/>
			<lve slot="1" name="54" begin="0" end="40"/>
		</localvariabletable>
	</operation>
	<operation name="94">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="95"/>
			<push arg="49"/>
			<findme/>
			<push arg="50"/>
			<call arg="51"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="52"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="45"/>
			<pcall arg="53"/>
			<dup/>
			<push arg="54"/>
			<load arg="19"/>
			<pcall arg="55"/>
			<dup/>
			<push arg="56"/>
			<push arg="96"/>
			<push arg="58"/>
			<new/>
			<pcall arg="59"/>
			<pusht/>
			<pcall arg="60"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="97" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="54" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="98">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="63"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="54"/>
			<call arg="64"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="56"/>
			<call arg="65"/>
			<store arg="66"/>
			<load arg="66"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="99"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="100"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="101"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="102"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="99"/>
			<call arg="103"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="104"/>
			<dup/>
			<getasm/>
			<getasm/>
			<load arg="29"/>
			<get arg="69"/>
			<call arg="72"/>
			<call arg="30"/>
			<set arg="69"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="105" begin="11" end="11"/>
			<lne id="106" begin="11" end="12"/>
			<lne id="107" begin="11" end="13"/>
			<lne id="108" begin="9" end="15"/>
			<lne id="109" begin="18" end="18"/>
			<lne id="110" begin="18" end="19"/>
			<lne id="111" begin="18" end="20"/>
			<lne id="112" begin="16" end="22"/>
			<lne id="113" begin="25" end="25"/>
			<lne id="114" begin="25" end="26"/>
			<lne id="115" begin="25" end="27"/>
			<lne id="116" begin="25" end="28"/>
			<lne id="117" begin="23" end="30"/>
			<lne id="118" begin="33" end="33"/>
			<lne id="119" begin="34" end="34"/>
			<lne id="120" begin="34" end="35"/>
			<lne id="121" begin="33" end="36"/>
			<lne id="122" begin="31" end="38"/>
			<lne id="97" begin="8" end="39"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="56" begin="7" end="39"/>
			<lve slot="2" name="54" begin="3" end="39"/>
			<lve slot="0" name="17" begin="0" end="39"/>
			<lve slot="1" name="85" begin="0" end="39"/>
		</localvariabletable>
	</operation>
</asm>
