# MSM7x01A
   zreladdr-$(CONFIG_ARCH_MSM7X01A)	:= 0x10008000
params_phys-$(CONFIG_ARCH_MSM7X01A)	:= 0x10000100
initrd_phys-$(CONFIG_ARCH_MSM7X01A)	:= 0x10800000

# MSM7x25
   zreladdr-$(CONFIG_ARCH_MSM7X25)	:= 0x00208000
params_phys-$(CONFIG_ARCH_MSM7X25)	:= 0x00200100
initrd_phys-$(CONFIG_ARCH_MSM7X25)	:= 0x0A000000

# MSM7x27
   zreladdr-$(CONFIG_ARCH_MSM7X27)	:= 0x00208000
params_phys-$(CONFIG_ARCH_MSM7X27)	:= 0x00200100
initrd_phys-$(CONFIG_ARCH_MSM7X27)	:= 0x0A000000

# MSM7x27A
   zreladdr-$(CONFIG_ARCH_MSM7X27A)	:= 0x00208000
params_phys-$(CONFIG_ARCH_MSM7X27A)	:= 0x00200100

# MSM8625
   zreladdr-$(CONFIG_ARCH_MSM8625)	:= 0x00208000
params_phys-$(CONFIG_ARCH_MSM8625)	:= 0x00200100

# MSM7x30
   zreladdr-$(CONFIG_ARCH_MSM7X30)	:= 0x00208000
params_phys-$(CONFIG_ARCH_MSM7X30)	:= 0x00200100
initrd_phys-$(CONFIG_ARCH_MSM7X30)	:= 0x01200000

ifeq ($(CONFIG_MSM_SOC_REV_A),y)
# QSD8X50A
   zreladdr-$(CONFIG_ARCH_QSD8X50)	:= 0x00008000
params_phys-$(CONFIG_ARCH_QSD8X50)	:= 0x00000100
initrd_phys-$(CONFIG_ARCH_QSD8X50)	:= 0x04000000
#else
# QSD8X50
#   zreladdr-$(CONFIG_ARCH_QSD8X50)	:= 0x20008000
#params_phys-$(CONFIG_ARCH_QSD8X50)	:= 0x20000100
#initrd_phys-$(CONFIG_ARCH_QSD8X50)	:= 0x21000000
endif
# QSD8x50 in HTC Leo
   zreladdr-$(CONFIG_MACH_HTCLEO)	:= 0x11808000
   params_phys-$(CONFIG_MACH_HTCLEO)	:= 0x11800100
   initrd_phys-$(CONFIG_MACH_HTCLEO)	:= 0x12800000

# MSM8x60
   zreladdr-$(CONFIG_ARCH_MSM8X60)	:= 0x40208000

# MSM8960
   zreladdr-$(CONFIG_ARCH_MSM8960)	:= 0x80208000

# MSM8930
   zreladdr-$(CONFIG_ARCH_MSM8930)	:= 0x80208000

# APQ8064
   zreladdr-$(CONFIG_ARCH_APQ8064)	:= 0x80208000

# MSM8974
   zreladdr-$(CONFIG_ARCH_MSM8974)	:= 0x00008000
        dtb-$(CONFIG_ARCH_MSM8974)	+= msm8974-cdp.dtb
        dtb-$(CONFIG_ARCH_MSM8974)	+= msm8974-fluid.dtb
        dtb-$(CONFIG_ARCH_MSM8974)	+= msm8974-liquid.dtb
        dtb-$(CONFIG_ARCH_MSM8974)	+= msm8974-mtp.dtb
        dtb-$(CONFIG_ARCH_MSM8974)	+= msm8974-rumi.dtb
        dtb-$(CONFIG_ARCH_MSM8974)	+= msm8974-sim.dtb

# MSM9615
   zreladdr-$(CONFIG_ARCH_MSM9615)	:= 0x40808000

# MSM9625
   zreladdr-$(CONFIG_ARCH_MSM9625)	:= 0x00208000
        dtb-$(CONFIG_ARCH_MSM9625)	+= msm9625-cdp.dtb
        dtb-$(CONFIG_ARCH_MSM9625)	+= msm9625-mtp.dtb
        dtb-$(CONFIG_ARCH_MSM9625)	+= msm9625-rumi.dtb

# MSM8226
   zreladdr-$(CONFIG_ARCH_MSM8226)	:= 0x00008000
        dtb-$(CONFIG_ARCH_MSM8226)	+= msm8226-sim.dtb

# FSM9XXX
   zreladdr-$(CONFIG_ARCH_FSM9XXX)	:= 0x10008000
params_phys-$(CONFIG_ARCH_FSM9XXX)	:= 0x10000100
initrd_phys-$(CONFIG_ARCH_FSM9XXX)	:= 0x12000000

# MPQ8092
   zreladdr-$(CONFIG_ARCH_MPQ8092)	:= 0x00008000

# MSM8910
   zreladdr-$(CONFIG_ARCH_MSM8910)	:= 0x00008000
        dtb-$(CONFIG_ARCH_MSM8910)	+= msm8910-rumi.dtb
        dtb-$(CONFIG_ARCH_MSM8910)	+= msm8910-sim.dtb
