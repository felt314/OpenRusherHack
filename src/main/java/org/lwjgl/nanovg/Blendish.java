package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class Blendish {
    public static final float BND_DISABLED_ALPHA = 0.5F;
    public static final int BND_LEFT = 0;
    public static final int BND_CENTER = 1;
    public static final int BND_DEFAULT = 0;
    public static final int BND_HOVER = 1;
    public static final int BND_ACTIVE = 2;
    public static final int BND_CORNER_NONE = 0;
    public static final int BND_CORNER_TOP_LEFT = 1;
    public static final int BND_CORNER_TOP_RIGHT = 2;
    public static final int BND_CORNER_DOWN_RIGHT = 4;
    public static final int BND_CORNER_DOWN_LEFT = 8;
    public static final int BND_CORNER_ALL = 15;
    public static final int BND_CORNER_TOP = 3;
    public static final int BND_CORNER_DOWN = 12;
    public static final int BND_CORNER_LEFT = 9;
    public static final int BND_CORNER_RIGHT = 6;
    public static final int BND_WIDGET_HEIGHT = 21;
    public static final int BND_TOOL_WIDTH = 20;
    public static final int BND_NODE_PORT_RADIUS = 5;
    public static final int BND_NODE_MARGIN_TOP = 25;
    public static final int BND_NODE_MARGIN_DOWN = 5;
    public static final int BND_NODE_MARGIN_SIDE = 10;
    public static final int BND_NODE_TITLE_HEIGHT = 20;
    public static final int BND_NODE_ARROW_AREA_WIDTH = 20;
    public static final int BND_SPLITTER_AREA_SIZE = 12;
    public static final int BND_SCROLLBAR_WIDTH = 13;
    public static final int BND_SCROLLBAR_HEIGHT = 14;
    public static final int BND_VSPACING = 1;
    public static final int BND_VSPACING_GROUP = 8;
    public static final int BND_HSPACING = 8;
    public static final int BND_ICON_NONE = BND_ICONID(0, 29);
    public static final int BND_ICON_QUESTION = BND_ICONID(1, 29);
    public static final int BND_ICON_ERROR = BND_ICONID(2, 29);
    public static final int BND_ICON_CANCEL = BND_ICONID(3, 29);
    public static final int BND_ICON_TRIA_RIGHT = BND_ICONID(4, 29);
    public static final int BND_ICON_TRIA_DOWN = BND_ICONID(5, 29);
    public static final int BND_ICON_TRIA_LEFT = BND_ICONID(6, 29);
    public static final int BND_ICON_TRIA_UP = BND_ICONID(7, 29);
    public static final int BND_ICON_ARROW_LEFTRIGHT = BND_ICONID(8, 29);
    public static final int BND_ICON_PLUS = BND_ICONID(9, 29);
    public static final int BND_ICON_DISCLOSURE_TRI_DOWN = BND_ICONID(10, 29);
    public static final int BND_ICON_DISCLOSURE_TRI_RIGHT = BND_ICONID(11, 29);
    public static final int BND_ICON_RADIOBUT_OFF = BND_ICONID(12, 29);
    public static final int BND_ICON_RADIOBUT_ON = BND_ICONID(13, 29);
    public static final int BND_ICON_MENU_PANEL = BND_ICONID(14, 29);
    public static final int BND_ICON_BLENDER = BND_ICONID(15, 29);
    public static final int BND_ICON_GRIP = BND_ICONID(16, 29);
    public static final int BND_ICON_DOT = BND_ICONID(17, 29);
    public static final int BND_ICON_COLLAPSEMENU = BND_ICONID(18, 29);
    public static final int BND_ICON_X = BND_ICONID(19, 29);
    public static final int BND_ICON_GO_LEFT = BND_ICONID(21, 29);
    public static final int BND_ICON_PLUG = BND_ICONID(22, 29);
    public static final int BND_ICON_UI = BND_ICONID(23, 29);
    public static final int BND_ICON_NODE = BND_ICONID(24, 29);
    public static final int BND_ICON_NODE_SEL = BND_ICONID(25, 29);
    public static final int BND_ICON_FULLSCREEN = BND_ICONID(0, 28);
    public static final int BND_ICON_SPLITSCREEN = BND_ICONID(1, 28);
    public static final int BND_ICON_RIGHTARROW_THIN = BND_ICONID(2, 28);
    public static final int BND_ICON_BORDERMOVE = BND_ICONID(3, 28);
    public static final int BND_ICON_VIEWZOOM = BND_ICONID(4, 28);
    public static final int BND_ICON_ZOOMIN = BND_ICONID(5, 28);
    public static final int BND_ICON_ZOOMOUT = BND_ICONID(6, 28);
    public static final int BND_ICON_PANEL_CLOSE = BND_ICONID(7, 28);
    public static final int BND_ICON_COPY_ID = BND_ICONID(8, 28);
    public static final int BND_ICON_EYEDROPPER = BND_ICONID(9, 28);
    public static final int BND_ICON_LINK_AREA = BND_ICONID(10, 28);
    public static final int BND_ICON_AUTO = BND_ICONID(11, 28);
    public static final int BND_ICON_CHECKBOX_DEHLT = BND_ICONID(12, 28);
    public static final int BND_ICON_CHECKBOX_HLT = BND_ICONID(13, 28);
    public static final int BND_ICON_UNLOCKED = BND_ICONID(14, 28);
    public static final int BND_ICON_LOCKED = BND_ICONID(15, 28);
    public static final int BND_ICON_UNPINNED = BND_ICONID(16, 28);
    public static final int BND_ICON_PINNED = BND_ICONID(17, 28);
    public static final int BND_ICON_SCREEN_BACK = BND_ICONID(18, 28);
    public static final int BND_ICON_RIGHTARROW = BND_ICONID(19, 28);
    public static final int BND_ICON_DOWNARROW_HLT = BND_ICONID(20, 28);
    public static final int BND_ICON_DOTSUP = BND_ICONID(21, 28);
    public static final int BND_ICON_DOTSDOWN = BND_ICONID(22, 28);
    public static final int BND_ICON_LINK = BND_ICONID(23, 28);
    public static final int BND_ICON_INLINK = BND_ICONID(24, 28);
    public static final int BND_ICON_PLUGIN = BND_ICONID(25, 28);
    public static final int BND_ICON_HELP = BND_ICONID(0, 27);
    public static final int BND_ICON_GHOST_ENABLED = BND_ICONID(1, 27);
    public static final int BND_ICON_COLOR = BND_ICONID(2, 27);
    public static final int BND_ICON_LINKED = BND_ICONID(3, 27);
    public static final int BND_ICON_UNLINKED = BND_ICONID(4, 27);
    public static final int BND_ICON_HAND = BND_ICONID(5, 27);
    public static final int BND_ICON_ZOOM_ALL = BND_ICONID(6, 27);
    public static final int BND_ICON_ZOOM_SELECTED = BND_ICONID(7, 27);
    public static final int BND_ICON_ZOOM_PREVIOUS = BND_ICONID(8, 27);
    public static final int BND_ICON_ZOOM_IN = BND_ICONID(9, 27);
    public static final int BND_ICON_ZOOM_OUT = BND_ICONID(10, 27);
    public static final int BND_ICON_RENDER_REGION = BND_ICONID(11, 27);
    public static final int BND_ICON_BORDER_RECT = BND_ICONID(12, 27);
    public static final int BND_ICON_BORDER_LASSO = BND_ICONID(13, 27);
    public static final int BND_ICON_FREEZE = BND_ICONID(14, 27);
    public static final int BND_ICON_STYLUS_PRESSURE = BND_ICONID(15, 27);
    public static final int BND_ICON_GHOST_DISABLED = BND_ICONID(16, 27);
    public static final int BND_ICON_NEW = BND_ICONID(17, 27);
    public static final int BND_ICON_FILE_TICK = BND_ICONID(18, 27);
    public static final int BND_ICON_QUIT = BND_ICONID(19, 27);
    public static final int BND_ICON_URL = BND_ICONID(20, 27);
    public static final int BND_ICON_RECOVER_LAST = BND_ICONID(21, 27);
    public static final int BND_ICON_FULLSCREEN_ENTER = BND_ICONID(23, 27);
    public static final int BND_ICON_FULLSCREEN_EXIT = BND_ICONID(24, 27);
    public static final int BND_ICON_BLANK1 = BND_ICONID(25, 27);
    public static final int BND_ICON_LAMP = BND_ICONID(0, 26);
    public static final int BND_ICON_MATERIAL = BND_ICONID(1, 26);
    public static final int BND_ICON_TEXTURE = BND_ICONID(2, 26);
    public static final int BND_ICON_ANIM = BND_ICONID(3, 26);
    public static final int BND_ICON_WORLD = BND_ICONID(4, 26);
    public static final int BND_ICON_SCENE = BND_ICONID(5, 26);
    public static final int BND_ICON_EDIT = BND_ICONID(6, 26);
    public static final int BND_ICON_GAME = BND_ICONID(7, 26);
    public static final int BND_ICON_RADIO = BND_ICONID(8, 26);
    public static final int BND_ICON_SCRIPT = BND_ICONID(9, 26);
    public static final int BND_ICON_PARTICLES = BND_ICONID(10, 26);
    public static final int BND_ICON_PHYSICS = BND_ICONID(11, 26);
    public static final int BND_ICON_SPEAKER = BND_ICONID(12, 26);
    public static final int BND_ICON_TEXTURE_SHADED = BND_ICONID(13, 26);
    public static final int BND_ICON_VIEW3D = BND_ICONID(0, 25);
    public static final int BND_ICON_IPO = BND_ICONID(1, 25);
    public static final int BND_ICON_OOPS = BND_ICONID(2, 25);
    public static final int BND_ICON_BUTS = BND_ICONID(3, 25);
    public static final int BND_ICON_FILESEL = BND_ICONID(4, 25);
    public static final int BND_ICON_IMAGE_COL = BND_ICONID(5, 25);
    public static final int BND_ICON_INFO = BND_ICONID(6, 25);
    public static final int BND_ICON_SEQUENCE = BND_ICONID(7, 25);
    public static final int BND_ICON_TEXT = BND_ICONID(8, 25);
    public static final int BND_ICON_IMASEL = BND_ICONID(9, 25);
    public static final int BND_ICON_SOUND = BND_ICONID(10, 25);
    public static final int BND_ICON_ACTION = BND_ICONID(11, 25);
    public static final int BND_ICON_NLA = BND_ICONID(12, 25);
    public static final int BND_ICON_SCRIPTWIN = BND_ICONID(13, 25);
    public static final int BND_ICON_TIME = BND_ICONID(14, 25);
    public static final int BND_ICON_NODETREE = BND_ICONID(15, 25);
    public static final int BND_ICON_LOGIC = BND_ICONID(16, 25);
    public static final int BND_ICON_CONSOLE = BND_ICONID(17, 25);
    public static final int BND_ICON_PREFERENCES = BND_ICONID(18, 25);
    public static final int BND_ICON_CLIP = BND_ICONID(19, 25);
    public static final int BND_ICON_ASSET_MANAGER = BND_ICONID(20, 25);
    public static final int BND_ICON_OBJECT_DATAMODE = BND_ICONID(0, 24);
    public static final int BND_ICON_EDITMODE_HLT = BND_ICONID(1, 24);
    public static final int BND_ICON_FACESEL_HLT = BND_ICONID(2, 24);
    public static final int BND_ICON_VPAINT_HLT = BND_ICONID(3, 24);
    public static final int BND_ICON_TPAINT_HLT = BND_ICONID(4, 24);
    public static final int BND_ICON_WPAINT_HLT = BND_ICONID(5, 24);
    public static final int BND_ICON_SCULPTMODE_HLT = BND_ICONID(6, 24);
    public static final int BND_ICON_POSE_HLT = BND_ICONID(7, 24);
    public static final int BND_ICON_PARTICLEMODE = BND_ICONID(8, 24);
    public static final int BND_ICON_LIGHTPAINT = BND_ICONID(9, 24);
    public static final int BND_ICON_SCENE_DATA = BND_ICONID(0, 23);
    public static final int BND_ICON_RENDERLAYERS = BND_ICONID(1, 23);
    public static final int BND_ICON_WORLD_DATA = BND_ICONID(2, 23);
    public static final int BND_ICON_OBJECT_DATA = BND_ICONID(3, 23);
    public static final int BND_ICON_MESH_DATA = BND_ICONID(4, 23);
    public static final int BND_ICON_CURVE_DATA = BND_ICONID(5, 23);
    public static final int BND_ICON_META_DATA = BND_ICONID(6, 23);
    public static final int BND_ICON_LATTICE_DATA = BND_ICONID(7, 23);
    public static final int BND_ICON_LAMP_DATA = BND_ICONID(8, 23);
    public static final int BND_ICON_MATERIAL_DATA = BND_ICONID(9, 23);
    public static final int BND_ICON_TEXTURE_DATA = BND_ICONID(10, 23);
    public static final int BND_ICON_ANIM_DATA = BND_ICONID(11, 23);
    public static final int BND_ICON_CAMERA_DATA = BND_ICONID(12, 23);
    public static final int BND_ICON_PARTICLE_DATA = BND_ICONID(13, 23);
    public static final int BND_ICON_LIBRARY_DATA_DIRECT = BND_ICONID(14, 23);
    public static final int BND_ICON_GROUP = BND_ICONID(15, 23);
    public static final int BND_ICON_ARMATURE_DATA = BND_ICONID(16, 23);
    public static final int BND_ICON_POSE_DATA = BND_ICONID(17, 23);
    public static final int BND_ICON_BONE_DATA = BND_ICONID(18, 23);
    public static final int BND_ICON_CONSTRAINT = BND_ICONID(19, 23);
    public static final int BND_ICON_SHAPEKEY_DATA = BND_ICONID(20, 23);
    public static final int BND_ICON_CONSTRAINT_BONE = BND_ICONID(21, 23);
    public static final int BND_ICON_CAMERA_STEREO = BND_ICONID(22, 23);
    public static final int BND_ICON_PACKAGE = BND_ICONID(23, 23);
    public static final int BND_ICON_UGLYPACKAGE = BND_ICONID(24, 23);
    public static final int BND_ICON_BRUSH_DATA = BND_ICONID(0, 22);
    public static final int BND_ICON_IMAGE_DATA = BND_ICONID(1, 22);
    public static final int BND_ICON_FILE = BND_ICONID(2, 22);
    public static final int BND_ICON_FCURVE = BND_ICONID(3, 22);
    public static final int BND_ICON_FONT_DATA = BND_ICONID(4, 22);
    public static final int BND_ICON_RENDER_RESULT = BND_ICONID(5, 22);
    public static final int BND_ICON_SURFACE_DATA = BND_ICONID(6, 22);
    public static final int BND_ICON_EMPTY_DATA = BND_ICONID(7, 22);
    public static final int BND_ICON_SETTINGS = BND_ICONID(8, 22);
    public static final int BND_ICON_RENDER_ANIMATION = BND_ICONID(9, 22);
    public static final int BND_ICON_RENDER_STILL = BND_ICONID(10, 22);
    public static final int BND_ICON_BOIDS = BND_ICONID(12, 22);
    public static final int BND_ICON_STRANDS = BND_ICONID(13, 22);
    public static final int BND_ICON_LIBRARY_DATA_INDIRECT = BND_ICONID(14, 22);
    public static final int BND_ICON_GREASEPENCIL = BND_ICONID(15, 22);
    public static final int BND_ICON_LINE_DATA = BND_ICONID(16, 22);
    public static final int BND_ICON_GROUP_BONE = BND_ICONID(18, 22);
    public static final int BND_ICON_GROUP_VERTEX = BND_ICONID(19, 22);
    public static final int BND_ICON_GROUP_VCOL = BND_ICONID(20, 22);
    public static final int BND_ICON_GROUP_UVS = BND_ICONID(21, 22);
    public static final int BND_ICON_RNA = BND_ICONID(24, 22);
    public static final int BND_ICON_RNA_ADD = BND_ICONID(25, 22);
    public static final int BND_ICON_OUTLINER_OB_EMPTY = BND_ICONID(0, 20);
    public static final int BND_ICON_OUTLINER_OB_MESH = BND_ICONID(1, 20);
    public static final int BND_ICON_OUTLINER_OB_CURVE = BND_ICONID(2, 20);
    public static final int BND_ICON_OUTLINER_OB_LATTICE = BND_ICONID(3, 20);
    public static final int BND_ICON_OUTLINER_OB_META = BND_ICONID(4, 20);
    public static final int BND_ICON_OUTLINER_OB_LAMP = BND_ICONID(5, 20);
    public static final int BND_ICON_OUTLINER_OB_CAMERA = BND_ICONID(6, 20);
    public static final int BND_ICON_OUTLINER_OB_ARMATURE = BND_ICONID(7, 20);
    public static final int BND_ICON_OUTLINER_OB_FONT = BND_ICONID(8, 20);
    public static final int BND_ICON_OUTLINER_OB_SURFACE = BND_ICONID(9, 20);
    public static final int BND_ICON_OUTLINER_OB_SPEAKER = BND_ICONID(10, 20);
    public static final int BND_ICON_RESTRICT_VIEW_OFF = BND_ICONID(19, 20);
    public static final int BND_ICON_RESTRICT_VIEW_ON = BND_ICONID(20, 20);
    public static final int BND_ICON_RESTRICT_SELECT_OFF = BND_ICONID(21, 20);
    public static final int BND_ICON_RESTRICT_SELECT_ON = BND_ICONID(22, 20);
    public static final int BND_ICON_RESTRICT_RENDER_OFF = BND_ICONID(23, 20);
    public static final int BND_ICON_RESTRICT_RENDER_ON = BND_ICONID(24, 20);
    public static final int BND_ICON_OUTLINER_DATA_EMPTY = BND_ICONID(0, 19);
    public static final int BND_ICON_OUTLINER_DATA_MESH = BND_ICONID(1, 19);
    public static final int BND_ICON_OUTLINER_DATA_CURVE = BND_ICONID(2, 19);
    public static final int BND_ICON_OUTLINER_DATA_LATTICE = BND_ICONID(3, 19);
    public static final int BND_ICON_OUTLINER_DATA_META = BND_ICONID(4, 19);
    public static final int BND_ICON_OUTLINER_DATA_LAMP = BND_ICONID(5, 19);
    public static final int BND_ICON_OUTLINER_DATA_CAMERA = BND_ICONID(6, 19);
    public static final int BND_ICON_OUTLINER_DATA_ARMATURE = BND_ICONID(7, 19);
    public static final int BND_ICON_OUTLINER_DATA_FONT = BND_ICONID(8, 19);
    public static final int BND_ICON_OUTLINER_DATA_SURFACE = BND_ICONID(9, 19);
    public static final int BND_ICON_OUTLINER_DATA_SPEAKER = BND_ICONID(10, 19);
    public static final int BND_ICON_OUTLINER_DATA_POSE = BND_ICONID(11, 19);
    public static final int BND_ICON_MESH_PLANE = BND_ICONID(0, 18);
    public static final int BND_ICON_MESH_CUBE = BND_ICONID(1, 18);
    public static final int BND_ICON_MESH_CIRCLE = BND_ICONID(2, 18);
    public static final int BND_ICON_MESH_UVSPHERE = BND_ICONID(3, 18);
    public static final int BND_ICON_MESH_ICOSPHERE = BND_ICONID(4, 18);
    public static final int BND_ICON_MESH_GRID = BND_ICONID(5, 18);
    public static final int BND_ICON_MESH_MONKEY = BND_ICONID(6, 18);
    public static final int BND_ICON_MESH_CYLINDER = BND_ICONID(7, 18);
    public static final int BND_ICON_MESH_TORUS = BND_ICONID(8, 18);
    public static final int BND_ICON_MESH_CONE = BND_ICONID(9, 18);
    public static final int BND_ICON_LAMP_POINT = BND_ICONID(12, 18);
    public static final int BND_ICON_LAMP_SUN = BND_ICONID(13, 18);
    public static final int BND_ICON_LAMP_SPOT = BND_ICONID(14, 18);
    public static final int BND_ICON_LAMP_HEMI = BND_ICONID(15, 18);
    public static final int BND_ICON_LAMP_AREA = BND_ICONID(16, 18);
    public static final int BND_ICON_META_EMPTY = BND_ICONID(19, 18);
    public static final int BND_ICON_META_PLANE = BND_ICONID(20, 18);
    public static final int BND_ICON_META_CUBE = BND_ICONID(21, 18);
    public static final int BND_ICON_META_BALL = BND_ICONID(22, 18);
    public static final int BND_ICON_META_ELLIPSOID = BND_ICONID(23, 18);
    public static final int BND_ICON_META_CAPSULE = BND_ICONID(24, 18);
    public static final int BND_ICON_SURFACE_NCURVE = BND_ICONID(0, 17);
    public static final int BND_ICON_SURFACE_NCIRCLE = BND_ICONID(1, 17);
    public static final int BND_ICON_SURFACE_NSURFACE = BND_ICONID(2, 17);
    public static final int BND_ICON_SURFACE_NCYLINDER = BND_ICONID(3, 17);
    public static final int BND_ICON_SURFACE_NSPHERE = BND_ICONID(4, 17);
    public static final int BND_ICON_SURFACE_NTORUS = BND_ICONID(5, 17);
    public static final int BND_ICON_CURVE_BEZCURVE = BND_ICONID(9, 17);
    public static final int BND_ICON_CURVE_BEZCIRCLE = BND_ICONID(10, 17);
    public static final int BND_ICON_CURVE_NCURVE = BND_ICONID(11, 17);
    public static final int BND_ICON_CURVE_NCIRCLE = BND_ICONID(12, 17);
    public static final int BND_ICON_CURVE_PATH = BND_ICONID(13, 17);
    public static final int BND_ICON_COLOR_RED = BND_ICONID(19, 17);
    public static final int BND_ICON_COLOR_GREEN = BND_ICONID(20, 17);
    public static final int BND_ICON_COLOR_BLUE = BND_ICONID(21, 17);
    public static final int BND_ICON_FORCE_FORCE = BND_ICONID(0, 16);
    public static final int BND_ICON_FORCE_WIND = BND_ICONID(1, 16);
    public static final int BND_ICON_FORCE_VORTEX = BND_ICONID(2, 16);
    public static final int BND_ICON_FORCE_MAGNETIC = BND_ICONID(3, 16);
    public static final int BND_ICON_FORCE_HARMONIC = BND_ICONID(4, 16);
    public static final int BND_ICON_FORCE_CHARGE = BND_ICONID(5, 16);
    public static final int BND_ICON_FORCE_LENNARDJONES = BND_ICONID(6, 16);
    public static final int BND_ICON_FORCE_TEXTURE = BND_ICONID(7, 16);
    public static final int BND_ICON_FORCE_CURVE = BND_ICONID(8, 16);
    public static final int BND_ICON_FORCE_BOID = BND_ICONID(9, 16);
    public static final int BND_ICON_FORCE_TURBULENCE = BND_ICONID(10, 16);
    public static final int BND_ICON_FORCE_DRAG = BND_ICONID(11, 16);
    public static final int BND_ICON_FORCE_SMOKEFLOW = BND_ICONID(12, 16);
    public static final int BND_ICON_MODIFIER = BND_ICONID(0, 12);
    public static final int BND_ICON_MOD_WAVE = BND_ICONID(1, 12);
    public static final int BND_ICON_MOD_BUILD = BND_ICONID(2, 12);
    public static final int BND_ICON_MOD_DECIM = BND_ICONID(3, 12);
    public static final int BND_ICON_MOD_MIRROR = BND_ICONID(4, 12);
    public static final int BND_ICON_MOD_SOFT = BND_ICONID(5, 12);
    public static final int BND_ICON_MOD_SUBSURF = BND_ICONID(6, 12);
    public static final int BND_ICON_HOOK = BND_ICONID(7, 12);
    public static final int BND_ICON_MOD_PHYSICS = BND_ICONID(8, 12);
    public static final int BND_ICON_MOD_PARTICLES = BND_ICONID(9, 12);
    public static final int BND_ICON_MOD_BOOLEAN = BND_ICONID(10, 12);
    public static final int BND_ICON_MOD_EDGESPLIT = BND_ICONID(11, 12);
    public static final int BND_ICON_MOD_ARRAY = BND_ICONID(12, 12);
    public static final int BND_ICON_MOD_UVPROJECT = BND_ICONID(13, 12);
    public static final int BND_ICON_MOD_DISPLACE = BND_ICONID(14, 12);
    public static final int BND_ICON_MOD_CURVE = BND_ICONID(15, 12);
    public static final int BND_ICON_MOD_LATTICE = BND_ICONID(16, 12);
    public static final int BND_ICON_CONSTRAINT_DATA = BND_ICONID(17, 12);
    public static final int BND_ICON_MOD_ARMATURE = BND_ICONID(18, 12);
    public static final int BND_ICON_MOD_SHRINKWRAP = BND_ICONID(19, 12);
    public static final int BND_ICON_MOD_CAST = BND_ICONID(20, 12);
    public static final int BND_ICON_MOD_MESHDEFORM = BND_ICONID(21, 12);
    public static final int BND_ICON_MOD_BEVEL = BND_ICONID(22, 12);
    public static final int BND_ICON_MOD_SMOOTH = BND_ICONID(23, 12);
    public static final int BND_ICON_MOD_SIMPLEDEFORM = BND_ICONID(24, 12);
    public static final int BND_ICON_MOD_MASK = BND_ICONID(25, 12);
    public static final int BND_ICON_MOD_CLOTH = BND_ICONID(0, 11);
    public static final int BND_ICON_MOD_EXPLODE = BND_ICONID(1, 11);
    public static final int BND_ICON_MOD_FLUIDSIM = BND_ICONID(2, 11);
    public static final int BND_ICON_MOD_MULTIRES = BND_ICONID(3, 11);
    public static final int BND_ICON_MOD_SMOKE = BND_ICONID(4, 11);
    public static final int BND_ICON_MOD_SOLIDIFY = BND_ICONID(5, 11);
    public static final int BND_ICON_MOD_SCREW = BND_ICONID(6, 11);
    public static final int BND_ICON_MOD_VERTEX_WEIGHT = BND_ICONID(7, 11);
    public static final int BND_ICON_MOD_DYNAMICPAINT = BND_ICONID(8, 11);
    public static final int BND_ICON_MOD_REMESH = BND_ICONID(9, 11);
    public static final int BND_ICON_MOD_OCEAN = BND_ICONID(10, 11);
    public static final int BND_ICON_MOD_WARP = BND_ICONID(11, 11);
    public static final int BND_ICON_MOD_SKIN = BND_ICONID(12, 11);
    public static final int BND_ICON_MOD_TRIANGULATE = BND_ICONID(13, 11);
    public static final int BND_ICON_MOD_WIREFRAME = BND_ICONID(14, 11);
    public static final int BND_ICON_REC = BND_ICONID(0, 10);
    public static final int BND_ICON_PLAY = BND_ICONID(1, 10);
    public static final int BND_ICON_FF = BND_ICONID(2, 10);
    public static final int BND_ICON_REW = BND_ICONID(3, 10);
    public static final int BND_ICON_PAUSE = BND_ICONID(4, 10);
    public static final int BND_ICON_PREV_KEYFRAME = BND_ICONID(5, 10);
    public static final int BND_ICON_NEXT_KEYFRAME = BND_ICONID(6, 10);
    public static final int BND_ICON_PLAY_AUDIO = BND_ICONID(7, 10);
    public static final int BND_ICON_PLAY_REVERSE = BND_ICONID(8, 10);
    public static final int BND_ICON_PREVIEW_RANGE = BND_ICONID(9, 10);
    public static final int BND_ICON_ACTION_TWEAK = BND_ICONID(10, 10);
    public static final int BND_ICON_PMARKER_ACT = BND_ICONID(11, 10);
    public static final int BND_ICON_PMARKER_SEL = BND_ICONID(12, 10);
    public static final int BND_ICON_PMARKER = BND_ICONID(13, 10);
    public static final int BND_ICON_MARKER_HLT = BND_ICONID(14, 10);
    public static final int BND_ICON_MARKER = BND_ICONID(15, 10);
    public static final int BND_ICON_SPACE2 = BND_ICONID(16, 10);
    public static final int BND_ICON_SPACE3 = BND_ICONID(17, 10);
    public static final int BND_ICON_KEYINGSET = BND_ICONID(18, 10);
    public static final int BND_ICON_KEY_DEHLT = BND_ICONID(19, 10);
    public static final int BND_ICON_KEY_HLT = BND_ICONID(20, 10);
    public static final int BND_ICON_MUTE_IPO_OFF = BND_ICONID(21, 10);
    public static final int BND_ICON_MUTE_IPO_ON = BND_ICONID(22, 10);
    public static final int BND_ICON_VISIBLE_IPO_OFF = BND_ICONID(23, 10);
    public static final int BND_ICON_VISIBLE_IPO_ON = BND_ICONID(24, 10);
    public static final int BND_ICON_DRIVER = BND_ICONID(25, 10);
    public static final int BND_ICON_SOLO_OFF = BND_ICONID(0, 9);
    public static final int BND_ICON_SOLO_ON = BND_ICONID(1, 9);
    public static final int BND_ICON_FRAME_PREV = BND_ICONID(2, 9);
    public static final int BND_ICON_FRAME_NEXT = BND_ICONID(3, 9);
    public static final int BND_ICON_NLA_PUSHDOWN = BND_ICONID(4, 9);
    public static final int BND_ICON_IPO_CONSTANT = BND_ICONID(5, 9);
    public static final int BND_ICON_IPO_LINEAR = BND_ICONID(6, 9);
    public static final int BND_ICON_IPO_BEZIER = BND_ICONID(7, 9);
    public static final int BND_ICON_IPO_SINE = BND_ICONID(8, 9);
    public static final int BND_ICON_IPO_QUAD = BND_ICONID(9, 9);
    public static final int BND_ICON_IPO_CUBIC = BND_ICONID(10, 9);
    public static final int BND_ICON_IPO_QUART = BND_ICONID(11, 9);
    public static final int BND_ICON_IPO_QUINT = BND_ICONID(12, 9);
    public static final int BND_ICON_IPO_EXPO = BND_ICONID(13, 9);
    public static final int BND_ICON_IPO_CIRC = BND_ICONID(14, 9);
    public static final int BND_ICON_IPO_BOUNCE = BND_ICONID(15, 9);
    public static final int BND_ICON_IPO_ELASTIC = BND_ICONID(16, 9);
    public static final int BND_ICON_IPO_BACK = BND_ICONID(17, 9);
    public static final int BND_ICON_IPO_EASE_IN = BND_ICONID(18, 9);
    public static final int BND_ICON_IPO_EASE_OUT = BND_ICONID(19, 9);
    public static final int BND_ICON_IPO_EASE_IN_OUT = BND_ICONID(20, 9);
    public static final int BND_ICON_VERTEXSEL = BND_ICONID(0, 8);
    public static final int BND_ICON_EDGESEL = BND_ICONID(1, 8);
    public static final int BND_ICON_FACESEL = BND_ICONID(2, 8);
    public static final int BND_ICON_LOOPSEL = BND_ICONID(3, 8);
    public static final int BND_ICON_ROTATE = BND_ICONID(5, 8);
    public static final int BND_ICON_CURSOR = BND_ICONID(6, 8);
    public static final int BND_ICON_ROTATECOLLECTION = BND_ICONID(7, 8);
    public static final int BND_ICON_ROTATECENTER = BND_ICONID(8, 8);
    public static final int BND_ICON_ROTACTIVE = BND_ICONID(9, 8);
    public static final int BND_ICON_ALIGN = BND_ICONID(10, 8);
    public static final int BND_ICON_SMOOTHCURVE = BND_ICONID(12, 8);
    public static final int BND_ICON_SPHERECURVE = BND_ICONID(13, 8);
    public static final int BND_ICON_ROOTCURVE = BND_ICONID(14, 8);
    public static final int BND_ICON_SHARPCURVE = BND_ICONID(15, 8);
    public static final int BND_ICON_LINCURVE = BND_ICONID(16, 8);
    public static final int BND_ICON_NOCURVE = BND_ICONID(17, 8);
    public static final int BND_ICON_RNDCURVE = BND_ICONID(18, 8);
    public static final int BND_ICON_PROP_OFF = BND_ICONID(19, 8);
    public static final int BND_ICON_PROP_ON = BND_ICONID(20, 8);
    public static final int BND_ICON_PROP_CON = BND_ICONID(21, 8);
    public static final int BND_ICON_SCULPT_DYNTOPO = BND_ICONID(22, 8);
    public static final int BND_ICON_PARTICLE_POINT = BND_ICONID(23, 8);
    public static final int BND_ICON_PARTICLE_TIP = BND_ICONID(24, 8);
    public static final int BND_ICON_PARTICLE_PATH = BND_ICONID(25, 8);
    public static final int BND_ICON_MAN_TRANS = BND_ICONID(0, 7);
    public static final int BND_ICON_MAN_ROT = BND_ICONID(1, 7);
    public static final int BND_ICON_MAN_SCALE = BND_ICONID(2, 7);
    public static final int BND_ICON_MANIPUL = BND_ICONID(3, 7);
    public static final int BND_ICON_SNAP_OFF = BND_ICONID(4, 7);
    public static final int BND_ICON_SNAP_ON = BND_ICONID(5, 7);
    public static final int BND_ICON_SNAP_NORMAL = BND_ICONID(6, 7);
    public static final int BND_ICON_SNAP_INCREMENT = BND_ICONID(7, 7);
    public static final int BND_ICON_SNAP_VERTEX = BND_ICONID(8, 7);
    public static final int BND_ICON_SNAP_EDGE = BND_ICONID(9, 7);
    public static final int BND_ICON_SNAP_FACE = BND_ICONID(10, 7);
    public static final int BND_ICON_SNAP_VOLUME = BND_ICONID(11, 7);
    public static final int BND_ICON_STICKY_UVS_LOC = BND_ICONID(13, 7);
    public static final int BND_ICON_STICKY_UVS_DISABLE = BND_ICONID(14, 7);
    public static final int BND_ICON_STICKY_UVS_VERT = BND_ICONID(15, 7);
    public static final int BND_ICON_CLIPUV_DEHLT = BND_ICONID(16, 7);
    public static final int BND_ICON_CLIPUV_HLT = BND_ICONID(17, 7);
    public static final int BND_ICON_SNAP_PEEL_OBJECT = BND_ICONID(18, 7);
    public static final int BND_ICON_GRID = BND_ICONID(19, 7);
    public static final int BND_ICON_PASTEDOWN = BND_ICONID(0, 6);
    public static final int BND_ICON_COPYDOWN = BND_ICONID(1, 6);
    public static final int BND_ICON_PASTEFLIPUP = BND_ICONID(2, 6);
    public static final int BND_ICON_PASTEFLIPDOWN = BND_ICONID(3, 6);
    public static final int BND_ICON_SNAP_SURFACE = BND_ICONID(8, 6);
    public static final int BND_ICON_AUTOMERGE_ON = BND_ICONID(9, 6);
    public static final int BND_ICON_AUTOMERGE_OFF = BND_ICONID(10, 6);
    public static final int BND_ICON_RETOPO = BND_ICONID(11, 6);
    public static final int BND_ICON_UV_VERTEXSEL = BND_ICONID(12, 6);
    public static final int BND_ICON_UV_EDGESEL = BND_ICONID(13, 6);
    public static final int BND_ICON_UV_FACESEL = BND_ICONID(14, 6);
    public static final int BND_ICON_UV_ISLANDSEL = BND_ICONID(15, 6);
    public static final int BND_ICON_UV_SYNC_SELECT = BND_ICONID(16, 6);
    public static final int BND_ICON_BBOX = BND_ICONID(0, 5);
    public static final int BND_ICON_WIRE = BND_ICONID(1, 5);
    public static final int BND_ICON_SOLID = BND_ICONID(2, 5);
    public static final int BND_ICON_SMOOTH = BND_ICONID(3, 5);
    public static final int BND_ICON_POTATO = BND_ICONID(4, 5);
    public static final int BND_ICON_ORTHO = BND_ICONID(6, 5);
    public static final int BND_ICON_LOCKVIEW_OFF = BND_ICONID(9, 5);
    public static final int BND_ICON_LOCKVIEW_ON = BND_ICONID(10, 5);
    public static final int BND_ICON_AXIS_SIDE = BND_ICONID(12, 5);
    public static final int BND_ICON_AXIS_FRONT = BND_ICONID(13, 5);
    public static final int BND_ICON_AXIS_TOP = BND_ICONID(14, 5);
    public static final int BND_ICON_NDOF_DOM = BND_ICONID(15, 5);
    public static final int BND_ICON_NDOF_TURN = BND_ICONID(16, 5);
    public static final int BND_ICON_NDOF_FLY = BND_ICONID(17, 5);
    public static final int BND_ICON_NDOF_TRANS = BND_ICONID(18, 5);
    public static final int BND_ICON_LAYER_USED = BND_ICONID(19, 5);
    public static final int BND_ICON_LAYER_ACTIVE = BND_ICONID(20, 5);
    public static final int BND_ICON_SORTALPHA = BND_ICONID(0, 3);
    public static final int BND_ICON_SORTBYEXT = BND_ICONID(1, 3);
    public static final int BND_ICON_SORTTIME = BND_ICONID(2, 3);
    public static final int BND_ICON_SORTSIZE = BND_ICONID(3, 3);
    public static final int BND_ICON_LONGDISPLAY = BND_ICONID(4, 3);
    public static final int BND_ICON_SHORTDISPLAY = BND_ICONID(5, 3);
    public static final int BND_ICON_GHOST = BND_ICONID(6, 3);
    public static final int BND_ICON_IMGDISPLAY = BND_ICONID(7, 3);
    public static final int BND_ICON_SAVE_AS = BND_ICONID(8, 3);
    public static final int BND_ICON_SAVE_COPY = BND_ICONID(9, 3);
    public static final int BND_ICON_BOOKMARKS = BND_ICONID(10, 3);
    public static final int BND_ICON_FONTPREVIEW = BND_ICONID(11, 3);
    public static final int BND_ICON_FILTER = BND_ICONID(12, 3);
    public static final int BND_ICON_NEWFOLDER = BND_ICONID(13, 3);
    public static final int BND_ICON_OPEN_RECENT = BND_ICONID(14, 3);
    public static final int BND_ICON_FILE_PARENT = BND_ICONID(15, 3);
    public static final int BND_ICON_FILE_REFRESH = BND_ICONID(16, 3);
    public static final int BND_ICON_FILE_FOLDER = BND_ICONID(17, 3);
    public static final int BND_ICON_FILE_BLANK = BND_ICONID(18, 3);
    public static final int BND_ICON_FILE_BLEND = BND_ICONID(19, 3);
    public static final int BND_ICON_FILE_IMAGE = BND_ICONID(20, 3);
    public static final int BND_ICON_FILE_MOVIE = BND_ICONID(21, 3);
    public static final int BND_ICON_FILE_SCRIPT = BND_ICONID(22, 3);
    public static final int BND_ICON_FILE_SOUND = BND_ICONID(23, 3);
    public static final int BND_ICON_FILE_FONT = BND_ICONID(24, 3);
    public static final int BND_ICON_FILE_TEXT = BND_ICONID(25, 3);
    public static final int BND_ICON_RECOVER_AUTO = BND_ICONID(0, 2);
    public static final int BND_ICON_SAVE_PREFS = BND_ICONID(1, 2);
    public static final int BND_ICON_LINK_BLEND = BND_ICONID(2, 2);
    public static final int BND_ICON_APPEND_BLEND = BND_ICONID(3, 2);
    public static final int BND_ICON_IMPORT = BND_ICONID(4, 2);
    public static final int BND_ICON_EXPORT = BND_ICONID(5, 2);
    public static final int BND_ICON_EXTERNAL_DATA = BND_ICONID(6, 2);
    public static final int BND_ICON_LOAD_FACTORY = BND_ICONID(7, 2);
    public static final int BND_ICON_LOOP_BACK = BND_ICONID(13, 2);
    public static final int BND_ICON_LOOP_FORWARDS = BND_ICONID(14, 2);
    public static final int BND_ICON_BACK = BND_ICONID(15, 2);
    public static final int BND_ICON_FORWARD = BND_ICONID(16, 2);
    public static final int BND_ICON_FILE_BACKUP = BND_ICONID(24, 2);
    public static final int BND_ICON_DISK_DRIVE = BND_ICONID(25, 2);
    public static final int BND_ICON_MATPLANE = BND_ICONID(0, 1);
    public static final int BND_ICON_MATSPHERE = BND_ICONID(1, 1);
    public static final int BND_ICON_MATCUBE = BND_ICONID(2, 1);
    public static final int BND_ICON_MONKEY = BND_ICONID(3, 1);
    public static final int BND_ICON_HAIR = BND_ICONID(4, 1);
    public static final int BND_ICON_ALIASED = BND_ICONID(5, 1);
    public static final int BND_ICON_ANTIALIASED = BND_ICONID(6, 1);
    public static final int BND_ICON_MAT_SPHERE_SKY = BND_ICONID(7, 1);
    public static final int BND_ICON_WORDWRAP_OFF = BND_ICONID(12, 1);
    public static final int BND_ICON_WORDWRAP_ON = BND_ICONID(13, 1);
    public static final int BND_ICON_SYNTAX_OFF = BND_ICONID(14, 1);
    public static final int BND_ICON_SYNTAX_ON = BND_ICONID(15, 1);
    public static final int BND_ICON_LINENUMBERS_OFF = BND_ICONID(16, 1);
    public static final int BND_ICON_LINENUMBERS_ON = BND_ICONID(17, 1);
    public static final int BND_ICON_SCRIPTPLUGINS = BND_ICONID(18, 1);
    public static final int BND_ICON_SEQ_SEQUENCER = BND_ICONID(0, 0);
    public static final int BND_ICON_SEQ_PREVIEW = BND_ICONID(1, 0);
    public static final int BND_ICON_SEQ_LUMA_WAVEFORM = BND_ICONID(2, 0);
    public static final int BND_ICON_SEQ_CHROMA_SCOPE = BND_ICONID(3, 0);
    public static final int BND_ICON_SEQ_HISTOGRAM = BND_ICONID(4, 0);
    public static final int BND_ICON_SEQ_SPLITVIEW = BND_ICONID(5, 0);
    public static final int BND_ICON_IMAGE_RGB = BND_ICONID(9, 0);
    public static final int BND_ICON_IMAGE_RGB_ALPHA = BND_ICONID(10, 0);
    public static final int BND_ICON_IMAGE_ALPHA = BND_ICONID(11, 0);
    public static final int BND_ICON_IMAGE_ZDEPTH = BND_ICONID(12, 0);
    public static final int BND_ICON_IMAGEFILE = BND_ICONID(13, 0);

    protected Blendish() {
        throw new UnsupportedOperationException();
    }

    public static native void nbndSetTheme(long var0);

    public static void bndSetTheme(BNDtheme var0) {
        nbndSetTheme(var0.address());
    }

    public static native long nbndGetTheme();

    
    @NativeType("BNDtheme const *")
    public static BNDtheme bndGetTheme() {
        long var0 = nbndGetTheme();
        return BNDtheme.createSafe(var0);
    }

    public static native void bndSetIconImage(int var0);

    public static native void bndSetFont(int var0);

    public static native void nbndLabel(long var0, float var2, float var3, float var4, float var5, int var6, long var7);

    public static void bndLabel(
        @NativeType("NVGcontext *") long var0, float var2, float var3, float var4, float var5, int var6, @NativeType("char const *") ByteBuffer var7
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.checkNT1Safe(var7);
        }

        nbndLabel(var0, var2, var3, var4, var5, var6, MemoryUtil.memAddressSafe(var7));
    }

    public static void bndLabel(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        float var5,
        int var6,
        @NativeType("char const *") CharSequence var7
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        MemoryStack var8 = MemoryStack.stackGet();
        int var9 = var8.getPointer();

        try {
            var8.nUTF8Safe(var7, true);
            long var10 = var7 == null ? 0L : var8.getPointerAddress();
            nbndLabel(var0, var2, var3, var4, var5, var6, var10);
        } finally {
            var8.setPointer(var9);
        }
    }

    public static native void nbndToolButton(long var0, float var2, float var3, float var4, float var5, int var6, int var7, int var8, long var9);

    public static void bndToolButton(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        float var5,
        int var6,
        @NativeType("BNDwidgetState") int var7,
        int var8,
        @NativeType("char const *") ByteBuffer var9
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.checkNT1Safe(var9);
        }

        nbndToolButton(var0, var2, var3, var4, var5, var6, var7, var8, MemoryUtil.memAddressSafe(var9));
    }

    public static void bndToolButton(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        float var5,
        int var6,
        @NativeType("BNDwidgetState") int var7,
        int var8,
        @NativeType("char const *") CharSequence var9
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        MemoryStack var10 = MemoryStack.stackGet();
        int var11 = var10.getPointer();

        try {
            var10.nUTF8Safe(var9, true);
            long var12 = var9 == null ? 0L : var10.getPointerAddress();
            nbndToolButton(var0, var2, var3, var4, var5, var6, var7, var8, var12);
        } finally {
            var10.setPointer(var11);
        }
    }

    public static native void nbndRadioButton(long var0, float var2, float var3, float var4, float var5, int var6, int var7, int var8, long var9);

    public static void bndRadioButton(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        float var5,
        int var6,
        @NativeType("BNDwidgetState") int var7,
        int var8,
        @NativeType("char const *") ByteBuffer var9
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.checkNT1Safe(var9);
        }

        nbndRadioButton(var0, var2, var3, var4, var5, var6, var7, var8, MemoryUtil.memAddressSafe(var9));
    }

    public static void bndRadioButton(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        float var5,
        int var6,
        @NativeType("BNDwidgetState") int var7,
        int var8,
        @NativeType("char const *") CharSequence var9
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        MemoryStack var10 = MemoryStack.stackGet();
        int var11 = var10.getPointer();

        try {
            var10.nUTF8Safe(var9, true);
            long var12 = var9 == null ? 0L : var10.getPointerAddress();
            nbndRadioButton(var0, var2, var3, var4, var5, var6, var7, var8, var12);
        } finally {
            var10.setPointer(var11);
        }
    }

    public static native int nbndTextFieldTextPosition(long var0, float var2, float var3, float var4, float var5, int var6, long var7, int var9, int var10);

    public static int bndTextFieldTextPosition(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        float var5,
        int var6,
        @NativeType("char const *") ByteBuffer var7,
        int var8,
        int var9
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.checkNT1Safe(var7);
        }

        return nbndTextFieldTextPosition(var0, var2, var3, var4, var5, var6, MemoryUtil.memAddressSafe(var7), var8, var9);
    }

    public static int bndTextFieldTextPosition(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        float var5,
        int var6,
        @NativeType("char const *") CharSequence var7,
        int var8,
        int var9
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        MemoryStack var10 = MemoryStack.stackGet();
        int var11 = var10.getPointer();

        int var14;
        try {
            var10.nUTF8Safe(var7, true);
            long var12 = var7 == null ? 0L : var10.getPointerAddress();
            var14 = nbndTextFieldTextPosition(var0, var2, var3, var4, var5, var6, var12, var8, var9);
        } finally {
            var10.setPointer(var11);
        }

        return var14;
    }

    public static native void nbndTextField(
        long var0, float var2, float var3, float var4, float var5, int var6, int var7, int var8, long var9, int var11, int var12
    );

    public static void bndTextField(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        float var5,
        int var6,
        @NativeType("BNDwidgetState") int var7,
        int var8,
        @NativeType("char const *") ByteBuffer var9,
        int var10,
        int var11
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.checkNT1Safe(var9);
        }

        nbndTextField(var0, var2, var3, var4, var5, var6, var7, var8, MemoryUtil.memAddressSafe(var9), var10, var11);
    }

    public static void bndTextField(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        float var5,
        int var6,
        @NativeType("BNDwidgetState") int var7,
        int var8,
        @NativeType("char const *") CharSequence var9,
        int var10,
        int var11
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        MemoryStack var12 = MemoryStack.stackGet();
        int var13 = var12.getPointer();

        try {
            var12.nUTF8Safe(var9, true);
            long var14 = var9 == null ? 0L : var12.getPointerAddress();
            nbndTextField(var0, var2, var3, var4, var5, var6, var7, var8, var14, var10, var11);
        } finally {
            var12.setPointer(var13);
        }
    }

    public static native void nbndOptionButton(long var0, float var2, float var3, float var4, float var5, int var6, long var7);

    public static void bndOptionButton(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        float var5,
        @NativeType("BNDwidgetState") int var6,
        @NativeType("char const *") ByteBuffer var7
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.checkNT1Safe(var7);
        }

        nbndOptionButton(var0, var2, var3, var4, var5, var6, MemoryUtil.memAddressSafe(var7));
    }

    public static void bndOptionButton(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        float var5,
        @NativeType("BNDwidgetState") int var6,
        @NativeType("char const *") CharSequence var7
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        MemoryStack var8 = MemoryStack.stackGet();
        int var9 = var8.getPointer();

        try {
            var8.nUTF8Safe(var7, true);
            long var10 = var7 == null ? 0L : var8.getPointerAddress();
            nbndOptionButton(var0, var2, var3, var4, var5, var6, var10);
        } finally {
            var8.setPointer(var9);
        }
    }

    public static native void nbndChoiceButton(long var0, float var2, float var3, float var4, float var5, int var6, int var7, int var8, long var9);

    public static void bndChoiceButton(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        float var5,
        int var6,
        @NativeType("BNDwidgetState") int var7,
        int var8,
        @NativeType("char const *") ByteBuffer var9
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.checkNT1Safe(var9);
        }

        nbndChoiceButton(var0, var2, var3, var4, var5, var6, var7, var8, MemoryUtil.memAddressSafe(var9));
    }

    public static void bndChoiceButton(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        float var5,
        int var6,
        @NativeType("BNDwidgetState") int var7,
        int var8,
        @NativeType("char const *") CharSequence var9
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        MemoryStack var10 = MemoryStack.stackGet();
        int var11 = var10.getPointer();

        try {
            var10.nUTF8Safe(var9, true);
            long var12 = var9 == null ? 0L : var10.getPointerAddress();
            nbndChoiceButton(var0, var2, var3, var4, var5, var6, var7, var8, var12);
        } finally {
            var10.setPointer(var11);
        }
    }

    public static native void nbndColorButton(long var0, float var2, float var3, float var4, float var5, int var6, long var7);

    public static void bndColorButton(
        @NativeType("NVGcontext *") long var0, float var2, float var3, float var4, float var5, int var6, @NativeType("NVGcolor") NVGColor var7
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nbndColorButton(var0, var2, var3, var4, var5, var6, var7.address());
    }

    public static native void nbndNumberField(long var0, float var2, float var3, float var4, float var5, int var6, int var7, long var8, long var10);

    public static void bndNumberField(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        float var5,
        int var6,
        @NativeType("BNDwidgetState") int var7,
        @NativeType("char const *") ByteBuffer var8,
        @NativeType("char const *") ByteBuffer var9
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.checkNT1Safe(var8);
            Checks.checkNT1Safe(var9);
        }

        nbndNumberField(var0, var2, var3, var4, var5, var6, var7, MemoryUtil.memAddressSafe(var8), MemoryUtil.memAddressSafe(var9));
    }

    public static void bndNumberField(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        float var5,
        int var6,
        @NativeType("BNDwidgetState") int var7,
        @NativeType("char const *") CharSequence var8,
        @NativeType("char const *") CharSequence var9
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        MemoryStack var10 = MemoryStack.stackGet();
        int var11 = var10.getPointer();

        try {
            var10.nUTF8Safe(var8, true);
            long var12 = var8 == null ? 0L : var10.getPointerAddress();
            var10.nUTF8Safe(var9, true);
            long var14 = var9 == null ? 0L : var10.getPointerAddress();
            nbndNumberField(var0, var2, var3, var4, var5, var6, var7, var12, var14);
        } finally {
            var10.setPointer(var11);
        }
    }

    public static native void nbndSlider(long var0, float var2, float var3, float var4, float var5, int var6, int var7, float var8, long var9, long var11);

    public static void bndSlider(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        float var5,
        int var6,
        @NativeType("BNDwidgetState") int var7,
        float var8,
        @NativeType("char const *") ByteBuffer var9,
        @NativeType("char const *") ByteBuffer var10
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.checkNT1Safe(var9);
            Checks.checkNT1Safe(var10);
        }

        nbndSlider(var0, var2, var3, var4, var5, var6, var7, var8, MemoryUtil.memAddressSafe(var9), MemoryUtil.memAddressSafe(var10));
    }

    public static void bndSlider(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        float var5,
        int var6,
        @NativeType("BNDwidgetState") int var7,
        float var8,
        @NativeType("char const *") CharSequence var9,
        @NativeType("char const *") CharSequence var10
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        MemoryStack var11 = MemoryStack.stackGet();
        int var12 = var11.getPointer();

        try {
            var11.nUTF8Safe(var9, true);
            long var13 = var9 == null ? 0L : var11.getPointerAddress();
            var11.nUTF8Safe(var10, true);
            long var15 = var10 == null ? 0L : var11.getPointerAddress();
            nbndSlider(var0, var2, var3, var4, var5, var6, var7, var8, var13, var15);
        } finally {
            var11.setPointer(var12);
        }
    }

    public static native void nbndScrollBar(long var0, float var2, float var3, float var4, float var5, int var6, float var7, float var8);

    public static void bndScrollBar(
        @NativeType("NVGcontext *") long var0, float var2, float var3, float var4, float var5, @NativeType("BNDwidgetState") int var6, float var7, float var8
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nbndScrollBar(var0, var2, var3, var4, var5, var6, var7, var8);
    }

    public static native void nbndMenuBackground(long var0, float var2, float var3, float var4, float var5, int var6);

    public static void bndMenuBackground(@NativeType("NVGcontext *") long var0, float var2, float var3, float var4, float var5, int var6) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nbndMenuBackground(var0, var2, var3, var4, var5, var6);
    }

    public static native void nbndMenuLabel(long var0, float var2, float var3, float var4, float var5, int var6, long var7);

    public static void bndMenuLabel(
        @NativeType("NVGcontext *") long var0, float var2, float var3, float var4, float var5, int var6, @NativeType("char const *") ByteBuffer var7
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.checkNT1Safe(var7);
        }

        nbndMenuLabel(var0, var2, var3, var4, var5, var6, MemoryUtil.memAddressSafe(var7));
    }

    public static void bndMenuLabel(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        float var5,
        int var6,
        @NativeType("char const *") CharSequence var7
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        MemoryStack var8 = MemoryStack.stackGet();
        int var9 = var8.getPointer();

        try {
            var8.nUTF8Safe(var7, true);
            long var10 = var7 == null ? 0L : var8.getPointerAddress();
            nbndMenuLabel(var0, var2, var3, var4, var5, var6, var10);
        } finally {
            var8.setPointer(var9);
        }
    }

    public static native void nbndMenuItem(long var0, float var2, float var3, float var4, float var5, int var6, int var7, long var8);

    public static void bndMenuItem(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        float var5,
        @NativeType("BNDwidgetState") int var6,
        int var7,
        @NativeType("char const *") ByteBuffer var8
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.checkNT1Safe(var8);
        }

        nbndMenuItem(var0, var2, var3, var4, var5, var6, var7, MemoryUtil.memAddressSafe(var8));
    }

    public static void bndMenuItem(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        float var5,
        @NativeType("BNDwidgetState") int var6,
        int var7,
        @NativeType("char const *") CharSequence var8
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        MemoryStack var9 = MemoryStack.stackGet();
        int var10 = var9.getPointer();

        try {
            var9.nUTF8Safe(var8, true);
            long var11 = var8 == null ? 0L : var9.getPointerAddress();
            nbndMenuItem(var0, var2, var3, var4, var5, var6, var7, var11);
        } finally {
            var9.setPointer(var10);
        }
    }

    public static native void nbndTooltipBackground(long var0, float var2, float var3, float var4, float var5);

    public static void bndTooltipBackground(@NativeType("NVGcontext *") long var0, float var2, float var3, float var4, float var5) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nbndTooltipBackground(var0, var2, var3, var4, var5);
    }

    public static native void nbndNodePort(long var0, float var2, float var3, int var4, long var5);

    public static void bndNodePort(
        @NativeType("NVGcontext *") long var0, float var2, float var3, @NativeType("BNDwidgetState") int var4, @NativeType("NVGcolor") NVGColor var5
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nbndNodePort(var0, var2, var3, var4, var5.address());
    }

    public static native void nbndNodeWire(long var0, float var2, float var3, float var4, float var5, int var6, int var7);

    public static void bndNodeWire(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        float var5,
        @NativeType("BNDwidgetState") int var6,
        @NativeType("BNDwidgetState") int var7
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nbndNodeWire(var0, var2, var3, var4, var5, var6, var7);
    }

    public static native void nbndColoredNodeWire(long var0, float var2, float var3, float var4, float var5, long var6, long var8);

    public static void bndColoredNodeWire(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        float var5,
        @NativeType("NVGcolor") NVGColor var6,
        @NativeType("NVGcolor") NVGColor var7
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nbndColoredNodeWire(var0, var2, var3, var4, var5, var6.address(), var7.address());
    }

    public static native void nbndNodeBackground(long var0, float var2, float var3, float var4, float var5, int var6, int var7, long var8, long var10);

    public static void bndNodeBackground(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        float var5,
        @NativeType("BNDwidgetState") int var6,
        int var7,
        @NativeType("char const *") ByteBuffer var8,
        @NativeType("NVGcolor") NVGColor var9
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.checkNT1Safe(var8);
        }

        nbndNodeBackground(var0, var2, var3, var4, var5, var6, var7, MemoryUtil.memAddressSafe(var8), var9.address());
    }

    public static void bndNodeBackground(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        float var5,
        @NativeType("BNDwidgetState") int var6,
        int var7,
        @NativeType("char const *") CharSequence var8,
        @NativeType("NVGcolor") NVGColor var9
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        MemoryStack var10 = MemoryStack.stackGet();
        int var11 = var10.getPointer();

        try {
            var10.nUTF8Safe(var8, true);
            long var12 = var8 == null ? 0L : var10.getPointerAddress();
            nbndNodeBackground(var0, var2, var3, var4, var5, var6, var7, var12, var9.address());
        } finally {
            var10.setPointer(var11);
        }
    }

    public static native void nbndSplitterWidgets(long var0, float var2, float var3, float var4, float var5);

    public static void bndSplitterWidgets(@NativeType("NVGcontext *") long var0, float var2, float var3, float var4, float var5) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nbndSplitterWidgets(var0, var2, var3, var4, var5);
    }

    public static native void nbndJoinAreaOverlay(long var0, float var2, float var3, float var4, float var5, int var6, int var7);

    public static void bndJoinAreaOverlay(
        @NativeType("NVGcontext *") long var0, float var2, float var3, float var4, float var5, @NativeType("int") boolean var6, @NativeType("int") boolean var7
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nbndJoinAreaOverlay(var0, var2, var3, var4, var5, var6 ? 1 : 0, var7 ? 1 : 0);
    }

    public static native float nbndLabelWidth(long var0, int var2, long var3);

    public static float bndLabelWidth(@NativeType("NVGcontext *") long var0, int var2, @NativeType("char const *") ByteBuffer var3) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.checkNT1Safe(var3);
        }

        return nbndLabelWidth(var0, var2, MemoryUtil.memAddressSafe(var3));
    }

    public static float bndLabelWidth(@NativeType("NVGcontext *") long var0, int var2, @NativeType("char const *") CharSequence var3) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        MemoryStack var4 = MemoryStack.stackGet();
        int var5 = var4.getPointer();

        float var8;
        try {
            var4.nUTF8Safe(var3, true);
            long var6 = var3 == null ? 0L : var4.getPointerAddress();
            var8 = nbndLabelWidth(var0, var2, var6);
        } finally {
            var4.setPointer(var5);
        }

        return var8;
    }

    public static native float nbndLabelHeight(long var0, int var2, long var3, float var5);

    public static float bndLabelHeight(@NativeType("NVGcontext *") long var0, int var2, @NativeType("char const *") ByteBuffer var3, float var4) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.checkNT1Safe(var3);
        }

        return nbndLabelHeight(var0, var2, MemoryUtil.memAddressSafe(var3), var4);
    }

    public static float bndLabelHeight(@NativeType("NVGcontext *") long var0, int var2, @NativeType("char const *") CharSequence var3, float var4) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        MemoryStack var5 = MemoryStack.stackGet();
        int var6 = var5.getPointer();

        float var9;
        try {
            var5.nUTF8Safe(var3, true);
            long var7 = var3 == null ? 0L : var5.getPointerAddress();
            var9 = nbndLabelHeight(var0, var2, var7, var4);
        } finally {
            var5.setPointer(var6);
        }

        return var9;
    }

    public static native void nbndTransparent(long var0, long var2);

    @NativeType("NVGcolor")
    public static NVGColor bndTransparent(@NativeType("NVGcolor") NVGColor var0, @NativeType("NVGcolor") NVGColor var1) {
        nbndTransparent(var0.address(), var1.address());
        return var1;
    }

    public static native void nbndOffsetColor(long var0, int var2, long var3);

    @NativeType("NVGcolor")
    public static NVGColor bndOffsetColor(@NativeType("NVGcolor") NVGColor var0, int var1, @NativeType("NVGcolor") NVGColor var2) {
        nbndOffsetColor(var0.address(), var1, var2.address());
        return var2;
    }

    public static native void nbndSelectCorners(long var0, float var2, int var3);

    public static void bndSelectCorners(@NativeType("float *") FloatBuffer var0, float var1, int var2) {
        if (Checks.CHECKS) {
            Checks.check(var0, 4);
        }

        nbndSelectCorners(MemoryUtil.memAddress(var0), var1, var2);
    }

    public static native void nbndInnerColors(long var0, long var2, long var4, int var6, int var7);

    public static void bndInnerColors(
        @NativeType("NVGcolor *") NVGColor var0,
        @NativeType("NVGcolor *") NVGColor var1,
        @NativeType("BNDwidgetTheme const *") BNDwidgetTheme var2,
        @NativeType("BNDwidgetState") int var3,
        @NativeType("int") boolean var4
    ) {
        nbndInnerColors(var0.address(), var1.address(), var2.address(), var3, var4 ? 1 : 0);
    }

    public static native void nbndTextColor(long var0, int var2, long var3);

    @NativeType("NVGcolor")
    public static NVGColor bndTextColor(
        @NativeType("BNDwidgetTheme const *") BNDwidgetTheme var0, @NativeType("BNDwidgetState") int var1, @NativeType("NVGcolor") NVGColor var2
    ) {
        nbndTextColor(var0.address(), var1, var2.address());
        return var2;
    }

    public static native void nbndScrollHandleRect(long var0, long var2, long var4, long var6, float var8, float var9);

    public static void bndScrollHandleRect(
        @NativeType("float *") FloatBuffer var0,
        @NativeType("float *") FloatBuffer var1,
        @NativeType("float *") FloatBuffer var2,
        @NativeType("float *") FloatBuffer var3,
        float var4,
        float var5
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0, 1);
            Checks.check(var1, 1);
            Checks.check(var2, 1);
            Checks.check(var3, 1);
        }

        nbndScrollHandleRect(MemoryUtil.memAddress(var0), MemoryUtil.memAddress(var1), MemoryUtil.memAddress(var2), MemoryUtil.memAddress(var3), var4, var5);
    }

    public static native void nbndRoundedBox(long var0, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9);

    public static void bndRoundedBox(
        @NativeType("NVGcontext *") long var0, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nbndRoundedBox(var0, var2, var3, var4, var5, var6, var7, var8, var9);
    }

    public static native void nbndBackground(long var0, float var2, float var3, float var4, float var5);

    public static void bndBackground(@NativeType("NVGcontext *") long var0, float var2, float var3, float var4, float var5) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nbndBackground(var0, var2, var3, var4, var5);
    }

    public static native void nbndBevel(long var0, float var2, float var3, float var4, float var5);

    public static void bndBevel(@NativeType("NVGcontext *") long var0, float var2, float var3, float var4, float var5) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nbndBevel(var0, var2, var3, var4, var5);
    }

    public static native void nbndBevelInset(long var0, float var2, float var3, float var4, float var5, float var6, float var7);

    public static void bndBevelInset(@NativeType("NVGcontext *") long var0, float var2, float var3, float var4, float var5, float var6, float var7) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nbndBevelInset(var0, var2, var3, var4, var5, var6, var7);
    }

    public static native void nbndIcon(long var0, float var2, float var3, int var4);

    public static void bndIcon(@NativeType("NVGcontext *") long var0, float var2, float var3, int var4) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nbndIcon(var0, var2, var3, var4);
    }

    public static native void nbndDropShadow(long var0, float var2, float var3, float var4, float var5, float var6, float var7, float var8);

    public static void bndDropShadow(@NativeType("NVGcontext *") long var0, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nbndDropShadow(var0, var2, var3, var4, var5, var6, var7, var8);
    }

    public static native void nbndInnerBox(
        long var0, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, long var10, long var12
    );

    public static void bndInnerBox(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        float var5,
        float var6,
        float var7,
        float var8,
        float var9,
        @NativeType("NVGcolor") NVGColor var10,
        @NativeType("NVGcolor") NVGColor var11
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nbndInnerBox(var0, var2, var3, var4, var5, var6, var7, var8, var9, var10.address(), var11.address());
    }

    public static native void nbndOutlineBox(
        long var0, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, long var10
    );

    public static void bndOutlineBox(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        float var5,
        float var6,
        float var7,
        float var8,
        float var9,
        @NativeType("NVGcolor") NVGColor var10
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nbndOutlineBox(var0, var2, var3, var4, var5, var6, var7, var8, var9, var10.address());
    }

    public static native void nbndIconLabelValue(
        long var0, float var2, float var3, float var4, float var5, int var6, long var7, int var9, float var10, long var11, long var13
    );

    public static void bndIconLabelValue(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        float var5,
        int var6,
        @NativeType("NVGcolor") NVGColor var7,
        int var8,
        float var9,
        @NativeType("char const *") ByteBuffer var10,
        @NativeType("char const *") ByteBuffer var11
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.checkNT1Safe(var10);
            Checks.checkNT1Safe(var11);
        }

        nbndIconLabelValue(var0, var2, var3, var4, var5, var6, var7.address(), var8, var9, MemoryUtil.memAddressSafe(var10), MemoryUtil.memAddressSafe(var11));
    }

    public static void bndIconLabelValue(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        float var5,
        int var6,
        @NativeType("NVGcolor") NVGColor var7,
        int var8,
        float var9,
        @NativeType("char const *") CharSequence var10,
        @NativeType("char const *") CharSequence var11
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        MemoryStack var12 = MemoryStack.stackGet();
        int var13 = var12.getPointer();

        try {
            var12.nUTF8Safe(var10, true);
            long var14 = var10 == null ? 0L : var12.getPointerAddress();
            var12.nUTF8Safe(var11, true);
            long var16 = var11 == null ? 0L : var12.getPointerAddress();
            nbndIconLabelValue(var0, var2, var3, var4, var5, var6, var7.address(), var8, var9, var14, var16);
        } finally {
            var12.setPointer(var13);
        }
    }

    public static native void nbndNodeIconLabel(
        long var0, float var2, float var3, float var4, float var5, int var6, long var7, long var9, int var11, float var12, long var13
    );

    public static void bndNodeIconLabel(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        float var5,
        int var6,
        @NativeType("NVGcolor") NVGColor var7,
        @NativeType("NVGcolor") NVGColor var8,
        int var9,
        float var10,
        @NativeType("char const *") ByteBuffer var11
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.checkNT1Safe(var11);
        }

        nbndNodeIconLabel(var0, var2, var3, var4, var5, var6, var7.address(), var8.address(), var9, var10, MemoryUtil.memAddressSafe(var11));
    }

    public static void bndNodeIconLabel(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        float var5,
        int var6,
        @NativeType("NVGcolor") NVGColor var7,
        @NativeType("NVGcolor") NVGColor var8,
        int var9,
        float var10,
        @NativeType("char const *") CharSequence var11
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        MemoryStack var12 = MemoryStack.stackGet();
        int var13 = var12.getPointer();

        try {
            var12.nUTF8Safe(var11, true);
            long var14 = var11 == null ? 0L : var12.getPointerAddress();
            nbndNodeIconLabel(var0, var2, var3, var4, var5, var6, var7.address(), var8.address(), var9, var10, var14);
        } finally {
            var12.setPointer(var13);
        }
    }

    public static native int nbndIconLabelTextPosition(
        long var0, float var2, float var3, float var4, float var5, int var6, float var7, long var8, int var10, int var11
    );

    public static int bndIconLabelTextPosition(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        float var5,
        int var6,
        float var7,
        @NativeType("char const *") ByteBuffer var8,
        int var9,
        int var10
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.checkNT1Safe(var8);
        }

        return nbndIconLabelTextPosition(var0, var2, var3, var4, var5, var6, var7, MemoryUtil.memAddressSafe(var8), var9, var10);
    }

    public static int bndIconLabelTextPosition(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        float var5,
        int var6,
        float var7,
        @NativeType("char const *") CharSequence var8,
        int var9,
        int var10
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        MemoryStack var11 = MemoryStack.stackGet();
        int var12 = var11.getPointer();

        int var15;
        try {
            var11.nUTF8Safe(var8, true);
            long var13 = var8 == null ? 0L : var11.getPointerAddress();
            var15 = nbndIconLabelTextPosition(var0, var2, var3, var4, var5, var6, var7, var13, var9, var10);
        } finally {
            var11.setPointer(var12);
        }

        return var15;
    }

    public static native void nbndIconLabelCaret(
        long var0, float var2, float var3, float var4, float var5, int var6, long var7, float var9, long var10, long var12, int var14, int var15
    );

    public static void bndIconLabelCaret(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        float var5,
        int var6,
        @NativeType("NVGcolor") NVGColor var7,
        float var8,
        @NativeType("char const *") ByteBuffer var9,
        @NativeType("NVGcolor") NVGColor var10,
        int var11,
        int var12
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
            Checks.checkNT1Safe(var9);
        }

        nbndIconLabelCaret(var0, var2, var3, var4, var5, var6, var7.address(), var8, MemoryUtil.memAddressSafe(var9), var10.address(), var11, var12);
    }

    public static void bndIconLabelCaret(
        @NativeType("NVGcontext *") long var0,
        float var2,
        float var3,
        float var4,
        float var5,
        int var6,
        @NativeType("NVGcolor") NVGColor var7,
        float var8,
        @NativeType("char const *") CharSequence var9,
        @NativeType("NVGcolor") NVGColor var10,
        int var11,
        int var12
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        MemoryStack var13 = MemoryStack.stackGet();
        int var14 = var13.getPointer();

        try {
            var13.nUTF8Safe(var9, true);
            long var15 = var9 == null ? 0L : var13.getPointerAddress();
            nbndIconLabelCaret(var0, var2, var3, var4, var5, var6, var7.address(), var8, var15, var10.address(), var11, var12);
        } finally {
            var13.setPointer(var14);
        }
    }

    public static native void nbndCheck(long var0, float var2, float var3, long var4);

    public static void bndCheck(@NativeType("NVGcontext *") long var0, float var2, float var3, @NativeType("NVGcolor") NVGColor var4) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nbndCheck(var0, var2, var3, var4.address());
    }

    public static native void nbndArrow(long var0, float var2, float var3, float var4, long var5);

    public static void bndArrow(@NativeType("NVGcontext *") long var0, float var2, float var3, float var4, @NativeType("NVGcolor") NVGColor var5) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nbndArrow(var0, var2, var3, var4, var5.address());
    }

    public static native void nbndUpDownArrow(long var0, float var2, float var3, float var4, long var5);

    public static void bndUpDownArrow(@NativeType("NVGcontext *") long var0, float var2, float var3, float var4, @NativeType("NVGcolor") NVGColor var5) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nbndUpDownArrow(var0, var2, var3, var4, var5.address());
    }

    public static native void nbndNodeArrowDown(long var0, float var2, float var3, float var4, long var5);

    public static void bndNodeArrowDown(@NativeType("NVGcontext *") long var0, float var2, float var3, float var4, @NativeType("NVGcolor") NVGColor var5) {
        if (Checks.CHECKS) {
            Checks.check(var0);
        }

        nbndNodeArrowDown(var0, var2, var3, var4, var5.address());
    }

    public static native void nbndNodeWireColor(long var0, int var2, long var3);

    @NativeType("NVGcolor")
    public static NVGColor bndNodeWireColor(
        @NativeType("BNDnodeTheme const *") BNDnodeTheme var0, @NativeType("BNDwidgetState") int var1, @NativeType("NVGcolor") NVGColor var2
    ) {
        nbndNodeWireColor(var0.address(), var1, var2.address());
        return var2;
    }

    public static native void nbndSelectCorners(float[] var0, float var1, int var2);

    public static void bndSelectCorners(@NativeType("float *") float[] var0, float var1, int var2) {
        if (Checks.CHECKS) {
            Checks.check(var0, 4);
        }

        nbndSelectCorners(var0, var1, var2);
    }

    public static native void nbndScrollHandleRect(float[] var0, float[] var1, float[] var2, float[] var3, float var4, float var5);

    public static void bndScrollHandleRect(
        @NativeType("float *") float[] var0,
        @NativeType("float *") float[] var1,
        @NativeType("float *") float[] var2,
        @NativeType("float *") float[] var3,
        float var4,
        float var5
    ) {
        if (Checks.CHECKS) {
            Checks.check(var0, 1);
            Checks.check(var1, 1);
            Checks.check(var2, 1);
            Checks.check(var3, 1);
        }

        nbndScrollHandleRect(var0, var1, var2, var3, var4, var5);
    }

    public static int BND_ICONID(int var0, int var1) {
        return var0 | var1 << 8;
    }

    static {
        LibNanoVG.initialize();
    }
}
