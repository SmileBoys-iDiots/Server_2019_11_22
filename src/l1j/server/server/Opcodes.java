package l1j.server.server; // ����  by feel.  160913

public class Opcodes {

	public Opcodes() {
	}
	public static final int C_PLATE = 0x01;	// �Խ��� Ŭ��
	public static final int C_LOGIN_TEST = 0x04;	// ã��[����]  (���� �̻�� by feel)
	public static final int C_CHANGE_ACCOUNTINFO = 0x05;	// CALL��ư .����  (���� �̻�� by feel)
	public static final int C_BLINK = 0x08;	// ã��[����]  (���� �̻�� by feel)
	public static final int C_BUYABLE_SPELL = 0x0B;	// ��ų ���� ����Ʈ
	public static final int C_HYPERTEXT_INPUT_RESULT = 0x0C;	// ������ ������ ���� ����
	public static final int C_ADD_BUDDY = 0x0D;	// ģ���߰�
	public static final int C_WITHDRAW = 0x0E;	// ���� ���[�ڱ��� �����Ѵ�]
	public static final int C_TELL = 0x11;	// ã��[����]
	public static final int C_ACCEPT_XCHG = 0x12;	// ��ȯ OK
	public static final int C_READ_NOTICE = 0x16;	// �α��� �� ��Ŷ
	public static final int C_HACTION = 0x17;	// Npc ��ȭ �׼� �κ�
	public static final int C_EXCHANGEABLE_SPELL = 0x18;	// ȣ�� ���� ����Ʈ
	public static final int C_USE_SPELL = 0x19;	// ��ų ��� �κ�
	public static final int C_ATTACK = 0x1A;	// �Ϲݰ��� �κ�
	public static final int C_UPLOAD_EMBLEM = 0x1C;	// ���嵥��Ÿ�� ������ ��û��
	public static final int C_MERCENARYSELECT = 0x20;	// ã��[����]  (���� �̻�� by feel)
	public static final int C_USE_ITEM = 0x21;	// ������ ��� �κ�
	public static final int C_LEAVE_PLEDGE = 0x22;	// ���� Ż��
	public static final int C_RANK_CONTROL = 0x24;	// [���]
	public static final int C_BOOKMARK = 0x28;	// [��� OO]
	public static final int C_MOVE = 0x29;	// �̵���û �κ�
	public static final int C_SAY = 0x2A;	// ã��[����]
	public static final int C_WHO_PLEDGE = 0x2B;	// [����]
	public static final int C_MERCENARYARRANGE = 0x2D;	// ã��[����]  (���� �̻�� by feel)
	public static final int C_MONITOR_CONTROL = 0x2E;	// ã��[����]  (���� �̻�� by feel)
	public static final int C_SLAVE_CONTROL = 0x30;	// �� ���� ��ǥ ����
	public static final int C_SAVEIO = 0x31;	// ĳ���κ���������
	public static final int C_WANTED = 0x32;	// ã��[����]  (���� �̻�� by feel)
	public static final int C_EXCLUDE = 0x33;	// [/����]
	public static final int C_DROP = 0x34;	// ������ ������
	public static final int C_ALIVE = 0x35;	// 1�и��� �ѹ��� ��
	public static final int C_BUILDER_CONTROL = 0x36;	// ã��[����]  (���� �̻�� by feel)
	public static final int C_SELECT_TIME = 0x3A;	// ã��[����]  (���� �̻�� by feel)
	public static final int C_INCLUDE = 0x3B;	// [����]  (���� �̻�� by feel)
	public static final int C_PERSONAL_SHOP = 0x3C;	// [���� -> OK]
	public static final int C_DELETE_CHARACTER = 0x3D;	// �ɸ��� ����
	public static final int C_SHUTDOWN = 0x3F;	// ����â ����, �޸�
	public static final int C_WHO = 0x42;	// [����]
	public static final int C_VERSION = 0x46;	// v Ŭ�� ���� ���� (���� �̻�� by feel)
	public static final int C_WHO_PARTY = 0x47;	// ã��[����]
	public static final int C_LOGIN_RESULT = 0x4C;	// ã��[����]  (���� �̻�� by feel)
	public static final int C_RETURN_SUMMON = 0x4D;	// �ڷ���Ʈ ���
	public static final int C_QUERY_PERSONAL_SHOP = 0x4E;	// ���λ��� buy, sell
	public static final int C_EXTENDED_PROTOBUF = 0x51;	// ���� ��Ŷ
	public static final int C_BAN = 0x52;	// ã��[����] (���� �̻�� by feel)
	public static final int C_CANCEL_XCHG = 0x53;	// ��ȯ ���
	public static final int C_NPC_ITEM_CONTROL = 0x54;	// �� �κ��丮 ������ ���
	public static final int C_LEAVE_PARTY = 0x55;	// ��Ƽ Ż��
	public static final int C_GOTO_MAP = 0x59;	// ã��[����]
	public static final int C_ADD_XCHG = 0x5B;	// ��ȯâ�� ������ �߰�
	public static final int C_WAREHOUSE_CONTROL = 0x61;	// â�� ���.
	public static final int C_MARRIAGE = 0x62;	// [ûȥ]
	public static final int C_CHANNEL = 0x63;	// �ҷ� ���� �Ű�(�Ű�)
	public static final int C_CONTROL_WEATHER = 0x64;	// ã��[����]  (���� �̻�� by feel)
	public static final int C_GET = 0x65;	// ������ �ݱ�.
	public static final int C_CREATE_CUSTOM_CHARACTER = 0x67;	// �ɸ� ����
	public static final int C_TELEPORT = 0x69;	// ã��[����] (���� �̻�� by feel)
	public static final int C_KICK = 0x6A;	// ã��[����] (���� �̻�� by feel)
	public static final int C_ADDR = 0x6B;	// ã��[����] (���� �̻�� by feel)
	public static final int C_DEAD_RESTART = 0x6D;	// ���߿� �׾ ���� ��������
	public static final int C_QUERY_CASTLE_SECURITY = 0x6E;	// ���� ġ�Ȱ���
	public static final int C_GIVE = 0x72;	// ������ ������ �ֱ�
	public static final int C_CHAT = 0x73;	// ��ũ�� ü�� by feel
	public static final int C_MERCENARYNAME = 0x74;	// ã��[����]  (���� �̻�� by feel)
	public static final int C_FIX = 0x78;	// �������, ������
	public static final int C_QUERY_BUDDY = 0x7A;	// ģ������Ʈ
	public static final int C_FAR_ATTACK = 0x7B;	// Ȱ���� �κ�
	public static final int C_CHANGE_PASSWORD = 0x7C;	// ã��[����] (������_by feel )
	public static final int C_TELEPORT_USER = 0x7D;	// ã��[����] (���� �̻�� by feel)
	public static final int C_CHANGE_DIRECTION = 0x80;	// 
	public static final int C_NEW_ACCOUNT = 0x82;	// ã��[����] (������_by feel )
	public static final int C_SELECTABLE_TIME = 0x85;	// ã��[����]  (���� �̻�� by feel)
	public static final int C_WISH = 0x86;	// ã��[����] (���� �̻�� by feel)
	public static final int C_EXTENDED = 0x89;	// �Ƶ����� ������ Ŭ��, �ΰ� ������, ����â
	public static final int C_READ_NEWS = 0x8B;	// �������� Ȯ�� ��������
	public static final int C_OPEN = 0x8E;	// ��¦ Ŭ�� �κ�.
	public static final int C_DUEL = 0x90;	// [����]
	public static final int C_ASK_XCHG = 0x91;	// [��ȯ]
	public static final int C_REGISTER_QUIZ = 0x93;	// ã��[����] (���� �̻�� by feel)
	public static final int C_FIXABLE_ITEM = 0x96;	// �����������Ʈ
	public static final int C_CHECK_PK = 0x97;	// [checkpk]
	public static final int C_SERVER_SELECT = 0x99;	// ã��[����] (���� �̻�� by feel)
	public static final int C_EXTENDED_HYBRID = 0x9A;	// ã��[����]  (���� �̻�� by feel)
	public static final int C_TITLE = 0x9B;	// ȣĪ ���ɾ�
	public static final int C_ARCHERARRANGE = 0x9C;	// ã��[����]  (���� �̻�� by feel)
	public static final int C_DELETE_BOOKMARK = 0x9D;	// [��� �� �����Ŭ�� delete]
	public static final int C_QUIT = 0xA0;	// 0x51 ����
	public static final int C_BOARD_READ = 0xA2;	// �Խ��� �б�
	public static final int C_MERCENARYEMPLOY = 0xA4;	// �뺴����
	public static final int C_EMBLEM = 0xA7;	// ���ù����� ���� ��ũ ��û[������ emblem����]
	public static final int C_ALT_ATTACK = 0xA8;	// ã��[����]  (���� �̻�� by feel)
	public static final int C_ENTER_SHIP = 0xAB;	// ã��[����]  (���� �̻�� by feel)
	public static final int C_INVITE_PARTY = 0xAC;	// ã��[����]  (���� �̻�� by feel)
	public static final int C_REMOVE_BUDDY = 0xAD;	// ģ������
	public static final int C_EXCHANGE_SPELL = 0xAE;	// ȣ�� ������Ͽ��� OK������
	public static final int C_BANISH_PARTY = 0xAF;	// ��Ƽ �߹�
	public static final int C_LOGOUT = 0xB0;	// �ٽ� �α�â���� �Ѿ��
	public static final int C_SHIFT_SERVER = 0xB3;	// ã��[����] (������_by feel )
	public static final int C_BOOK = 0xB7;	// ã��[����]  (���� �̻�� by feel)
	public static final int C_INVITE_PARTY_TARGET = 0xB9;	// ��Ƽ �ʴ�
	public static final int C_BOARD_DELETE = 0xBE;	// �Խ��� �Խñ� ����
	public static final int C_EXIT_GHOST = 0xC0;	// ���Ѵ��� ������� Ż��  (���� �̻�� by feel)
	public static final int C_MATCH_MAKING = 0xC5;	// ã��[����]  (���� �̻�� by feel)
	public static final int C_CHECK_INVENTORY = 0xC6;	// �� �κ��丮[�� �޴�]
	public static final int C_ENTER_PORTAL = 0xC7;	// (ENTER_PORTAL)
	public static final int C_THROW = 0xC8;	// ���� ����
	public static final int C_SILENCE = 0xC9;	// ã��[����] (���� �̻�� by feel)
	public static final int C_GOTO_PORTAL = 0xCB;	// ������ ��ư���� ��Ż ���� Ȯ��ġ ����
	public static final int C_WAR = 0xCE;	// ����
	public static final int C_BOARD_WRITE = 0xCF;	// �Խ��� ����
	public static final int C_VOICE_CHAT = 0xD0;	// ���� �ʱ�ȭ.
	public static final int C_JOIN_PLEDGE = 0xD1;	// [����]
	public static final int C_TAX = 0xD4;	// ���� ����
	public static final int C_SMS = 0xD6;	// ����    ã��[����]  (���� �̻�� by feel)
	public static final int C_BUY_SELL = 0xD7;	// ���� ��� ó��
	public static final int C_ONOFF = 0xD8;	// [ȯ�漳��->��ê��,��].
	public static final int C_DEPOSIT = 0xD9;	// �� ���� �Ա�
	public static final int C_REQUEST_ROLL = 0xDA;	// ã��[����]  (���� �̻�� by feel)
	public static final int C_START_CASTING = 0xDC;	// ã��[����]  (���� �̻�� by feel)
	public static final int C_BOARD_LIST = 0xDD;	// �Խ��� next
	public static final int C_MAIL = 0xDF;	// ���� �б�
	public static final int C_PLEDGE_WATCH = 0xE2;	// ���� �ֽ� ���� ���
	public static final int C_RESTART = 0xE4;	// ���߿� ����â���� ����. [ C_CHARACTERCONFIG ������ ����� ]
	public static final int C_SUMMON = 0xE5;	// CALL��ư .����
	public static final int C_CHAT_PARTY_CONTROL = 0xE7;	// ä����Ƽä���ʴ�
	public static final int C_CLIENT_READY = 0xE8;	// ã��[����]  (���� �̻�� by feel)
	public static final int C_LOGIN = 0xE9;	// v ���������� ��� ��Ŷ
	public static final int C_ENTER_WORLD = 0xEC;	// ����â���� �ɸ� ����
	public static final int C_ATTACK_CONTINUE = 0xED;	// �ڵ�Į��
	public static final int C_CREATE_PLEDGE = 0xF4;	// ���� â��
	public static final int C_BAN_MEMBER = 0xF5;	// ���� �߹� ���ɾ�
	public static final int C_ACTION = 0xF6;	// <��Ʈ+1 ~ 5 ���� �׼� >
	public static final int C_CHANGE_CASTLE_SECURITY = 0xF7;	// ���� ġ�� ����
	public static final int C_ANSWER = 0xF8;	// [ Y , N ] ���� �κ�
	public static final int C_DESTROY_ITEM = 0xFA;	// �����뿡 ������ ����
	public static final int C_SAVE = 0xFB;	// ������� �Ϸ� - ����  (���� �̻�� by feel)
	public static final int C_DIALOG = 0xFC;	// Npc�� ��ȭ�κ�
	public static final int C_BUY_SPELL = 0xFD;	// ��ų ���� OK


	public static final int S_CHANGE_PASSWORD_CHECK = 0x00;	// ã��[����]  (���� �̻�� by feel)
	public static final int S_WEATHER = 0x01;	// ���� �����ϱ�
	public static final int S_DRUNKEN = 0x02;	// ��
	public static final int S_POISON = 0x04;	// ���� ���� ���� : ǥ�� ���볪 ť�������� �Ẹ�� ��
	public static final int S_XCHG_RESULT = 0x05;	// �ŷ� ���, �Ϸ�
	public static final int S_NOT_ENOUGH_FOR_SPELL = 0x0C;	// ȣ�� ��� ����
	public static final int S_CHANGE_ATTR = 0x0D;	// ��ġ���� �̵�����&�Ұ��� ���� �κ�
	public static final int S_TELL = 0x0F;	// �ӼӸ�
	public static final int S_REQUEST_SUMMON = 0x11;	// �ڷ���Ʈ[�չٴ�]
	public static final int S_BOARD_READ = 0x12;	// �Խ��� �б�
	public static final int S_ROLL_RESULT = 0x14;	// ã��[����]  (���� �̻�� by feel)
	public static final int S_REMOVE_INVENTORY = 0x15;	// �κ��丮 ������ ����
	public static final int S_CHANGE_DIRECTION = 0x16;	// ���� ��ȯ �κ� [�����̴� ���Ǿ��� ���ɾ üũ]
	public static final int S_ADD_SPELL = 0x19;	// ��ų �߰�[������Ŷ�ڽ� ����]
	public static final int S_MERCENARYNAME = 0x1A;	// ã��[����]  (���� �̻�� by feel)
	public static final int S_CHANGE_ALIGNMENT = 0x1D;	// ���Ǯ
	public static final int S_HIT_POINT = 0x20;	// HP ������Ʈ
	public static final int S_NOTICE = 0x21;	// �α����� ��Ŷ
	public static final int S_CLONE = 0x22;	// npc ����(���簻�� ���) (���� �̻�� by feel)
	public static final int S_DELETE_CHARACTER_CHECK = 0x23;	// �ɸ� ����
	public static final int S_EFFECT = 0x25;	// ����Ʈ �κ� (���̽�Ʈ��)
	public static final int S_PERSONAL_SHOP_LIST = 0x26;	// ���λ��� ��ǰ ����
	public static final int S_BLIND = 0x2A;	// ���ֱ� ȿ��
	public static final int S_CREATE_CHARACTER_CHECK = 0x2D;	// ĳ���� ������ ó���κ�
	public static final int S_CHANGE_DESC = 0x2E;	// ������Ʈ ���Ӻ����
	public static final int S_BUYABLE_SPELL_LIST = 0x30;	// ��ų ���� â
	public static final int S_CHANGE_ITEM_USE = 0x31;	// ã��[����]  (���� �̻�� by feel)
	public static final int S_ATTACK_ALL = 0x32;	// ã��[����]  (���� �̻�� by feel)
	public static final int S_EXP = 0x34;	// ����ġ ����  (���� �̻�� by feel)
	public static final int S_MOVE_OBJECT = 0x36;	// �̵� ������Ʈ
	public static final int S_TAX = 0x3A;	// ���� ����
	public static final int S_VOICE_CHAT = 0x3B;	// v ���� �ʱ�ȭ ����
	public static final int S_COMMAND_TARGET = 0x3D;	// ã��[����]  (���� �̻�� by feel)
	public static final int S_ADD_INVENTORY_BATCH = 0x41;	// �κ��丮�� �����۸���Ʈ
	public static final int S_AGIT_MAP = 0x42;	// ã��[����]
	public static final int S_SERVER_LIST = 0x44;	// ã��[����]  (���� �̻�� by feel)
	public static final int S_AC = 0x45;	// AC �� �Ӽ���� ���� [������Ʈ �Ƹ� ���� ����]
	public static final int S_NEW_CHAR_INFO = 0x47;	// �ɸ� ���� ����� ������
	public static final int S_ACTION = 0x48;	// �׼� �κ�(�´¸����)
	public static final int S_CHARACTER_INFO = 0x4B;	// v �ɸ��͸���Ʈ�� �ɸ�����
	public static final int S_MAGE_STRENGTH = 0x4D;	// ����
	public static final int S_WITHDRAW = 0x4E;	// ���� ���
	public static final int S_PING = 0x4F;	// ã��[����]  (���� �̻�� by feel)
	public static final int S_MASTER = 0x51;	// ã��[����]  (���� �̻�� by feel)
	public static final int S_CRIMINAL = 0x52;	// ������
	public static final int S_HYPERTEXT = 0x53;	// NpcŬ�� Html����
	public static final int S_CHANGE_LEVEL = 0x55;	// ã��[����]  (���� �̻�� by feel)
	public static final int S_ASK = 0x57;	// [ Y , N ] �޼���
	public static final int S_CASTLE_OWNER = 0x59;	// ��������� ����
	public static final int S_RESTART = 0x5D;	// ã��[����]
	public static final int S_BLINK = 0x5E;	// ã��[����]  (���� �̻�� by feel)
	public static final int S_SELECTABLE_TIME_LIST = 0x5F;	// �����ð� ����
	public static final int S_VERSION_CHECK = 0x61;	// ��������  (���� �̻�� by feel)
	public static final int S_WAR = 0x63;	// ����
	public static final int S_AGIT_LIST = 0x64;	// ����Ʈ ����Ʈ
	public static final int S_CHANGE_LIGHT = 0x65;	// ���
	public static final int S_SHOW_MAP = 0x67;	// ã��[����]  (���� �̻�� by feel)
	public static final int S_RESURRECT = 0x6D;	// ��Ȱ ó�� �κ�
	public static final int S_PORTAL = 0x6E;	// 
	public static final int S_ATTACK_MANY = 0x70;	// ���� �������� ��ų
	public static final int S_REMOVE_SPELL = 0x78;	// ��ų ���� (���ɷ� ����) ��������
	public static final int S_EVENT = 0x79;	// v ���� ��Ŷ ���� ���
	public static final int S_ADD_BOOKMARK = 0x7B;	// ��� ����Ʈ
	public static final int S_ABILITY_SCORES = 0x7C;	// �������ͽ� ����(��ũ����,����)
	public static final int S_IDENTIFY_CODE = 0x7D;	// Ȯ���ֹ���
	public static final int S_HIT_RATIO = 0x7E;	// �̴� HPǥ�� �κ�
	public static final int S_CHANGE_ITEM_DESC_EX = 0x80;	// �κ� ������ ����
	public static final int S_NUM_CHARACTER = 0x82;	// v �ش� ������ �ɸ� ����
	public static final int S_CHANGE_ITEM_DESC = 0x86;	// ������ ���� (Eǥ��)
	public static final int S_INVISIBLE = 0x87;	// ����
	public static final int S_SAY_CODE = 0x88;	// ������ ��
	public static final int S_MESSAGE = 0x8A;	// �ý��� �޼��� (��� ä��).
	public static final int S_PLEDGE_WATCH = 0x8B;	// ���� ���� �ֽ�
	public static final int S_SELL_LIST = 0x8D;	// ������ �Ǹ� �κ�
	public static final int S_FIXABLE_ITEM_LIST = 0x8E;	// ������� ����Ʈ
	public static final int S_MAGE_SHIELD = 0x90;	// ����
	public static final int S_READ_MAIL = 0x95;	// ã��[����]  (���� �̻�� by feel)
	public static final int S_BOARD_LIST = 0x97;	// �Խ��� Ŭ��
	public static final int S_SLAVE_CONTROL = 0x99;	// �� ���� ��ǥ����
	public static final int S_EMBLEM = 0x9A;	// Ŭ�� ������ ��û
	public static final int S_ADD_XCHG = 0x9B;	// �ŷ�â ������ �߰� �κ�
	public static final int S_SAY = 0x9C;	// �Ϲ� ä��
	public static final int S_STATUS = 0xA0;	// �ɸ� ���� ����
	public static final int S_MAGE_DEXTERITY = 0xA1;	// ������
	public static final int S_TITLE = 0xA2;	// ȣĪ ����
	public static final int S_WARNING_CODE = 0xA3;	// ã��[����]  (���� �̻�� by feel)
	public static final int S_CHANGE_ITEM_TYPE = 0xA4;	// ã��[����]  (���� �̻�� by feel)
	public static final int S_BOOK_LIST = 0xA5;	// ã��[����]  (���� �̻�� by feel)
	public static final int S_MERCENARYARRANGE = 0xA9;	// ������ �뺴 �ֱ�
	public static final int S_ATTACK = 0xAB;	// ���� ǥ�� �κ�
	public static final int S_CLIENT_READY = 0xB2;	// ã��[����]  (���� �̻�� by feel)
	public static final int S_PUT_OBJECT = 0xB3;	// ������Ʈ �׸���
	public static final int S_EXTENDED_PROTOBUF = 0xB4;	// ���� ��Ŷ
	public static final int S_EXTENDED_HYBRID = 0xB5;	// ã��[����]  (���� �̻�� by feel)
	public static final int S_RETRIEVE_LIST = 0xB6;	// â�� ����Ʈ
	public static final int S_HYPERTEXT_INPUT = 0xB8;	// ������ ������ ���� ���� [����]
	public static final int S_WIELD = 0xBB;	// ���� ��,Ż �κ�
	public static final int S_POLYMORPH = 0xBC;	// ����
	public static final int S_MANA_POINT = 0xBD;	// MP ������Ʈ
	public static final int S_WORLD = 0xBE;	// ã��[����]
	public static final int S_SOUND_EFFECT = 0xC2;	// ���� ����Ʈ �κ�[�� ȣ����� ã��]
	public static final int S_MAIL_INFO = 0xC3;	// ���� �б�.
	public static final int S_EXCHANGEABLE_SPELL_LIST = 0xC6;	// ȣ�� ���� ����â
	public static final int S_ENTER_WORLD_CHECK = 0xC8;	// ���Ӵ��
	public static final int S_XCHG_START = 0xC9;	// �ŷ�â �κ�
	public static final int S_TIME = 0xCA;	// ���� �ð�
	public static final int S_MATCH_MAKING = 0xCC;	// ã��[����]  (���� �̻�� by feel)
	public static final int S_MERCENARYSELECT = 0xCE;	// ������ �뺴�� ��ġ
	public static final int S_LOGIN_CHECK = 0xCF;	// ��Ż�̵��� ������� ��Ŷ(ȣ����������)Ȯ��ġ����
	public static final int S_PLEDGE = 0xD0;	// Ŭ�� ������Ʈ, �ƹ� �����̳� �����ϱ�
	public static final int S_WANTED_LOGIN = 0xD1;	// ������ Ƚ�� �޽���
	public static final int S_KICK = 0xD2;	// �ش� �ɸ� ���� ����
	public static final int S_BUY_LIST = 0xD4;	// ���� ���� �κ�[BUY]
	public static final int S_EFFECT_LOC = 0xD5;	// Ʈ�� (��ǥ�� ����Ʈ)  ���� �����̾�� ���� ��
	public static final int S_ARCHERARRANGE = 0xD7;	// ã��[����]  (���� �̻�� by feel)
	public static final int S_DEPOSIT = 0xD8;	// ���� �Ա�
	public static final int S_EXTENDED = 0xDB;	// �Ƶ����������� ��ħ ���
	public static final int S_CHANGE_ACCOUNTINFO_CHECK = 0xDD;	// ã��[����]  (���� �̻�� by feel)
	public static final int S_CHANGE_COUNT = 0xDE;	// ã��[����]  (���� �̻�� by feel)
	public static final int S_CHANGE_ABILITY = 0xE0;	// �̹�, �ҹ� ������ ���
	public static final int S_DECREE = 0xE1;	// ã��[����]  (���� �̻�� by feel)
	public static final int S_MAGIC_STATUS = 0xE5;	// sp�� mr����
	public static final int S_CHANGE_ITEM_BLESS = 0xE7;	// ���� �ֹ���, �����ܼ� �缭 ���ž���⿡ �ٸ���
	public static final int S_NEWS = 0xE9;	// ����
	public static final int S_KEY = 0xEB;	// ���� ��ȯ �κ� [�����̴� ���Ǿ��� ���ɾ üũ]  (���� �̻�� by feel)
	public static final int S_EMOTION = 0xED;	// ���
	public static final int S_MERCENARYEMPLOY = 0xF0;	// �� �뺴 ����  0612 - �ȹٳ�
	public static final int S_ADD_INVENTORY = 0xF5;	// ������ ����[������ ���ɴٰ��Ա�]
	public static final int S_PARALYSE = 0xF9;	// �ൿ ���� (Ŀ���з� ����) �縷 �����ǿ����� ���� Ŀ�����ϱ�
	public static final int S_REMOVE_OBJECT = 0xFA;	// ������Ʈ ���� (���etc)
	public static final int S_NEW_ACCOUNT_CHECK = 0xFB;	// ã��[����]  (���� �̻�� by feel)
	public static final int S_SPEED = 0xFC;	// ���̽�Ʈ
	public static final int S_MESSAGE_CODE = 0xFE;	// ���� �޼���[���ߺ�����üũ]
	public static final int S_BREATH = 0xFF;	// ���� ������ 
}