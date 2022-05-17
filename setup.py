from distutils.core import setup
import setup_translate


setup(name='enigma2-plugin-systemplugins-forceFbcLNBpower',
		version='1.3',
		author='Dmitrij openPLi',
		author_email='dima-73@inbox.lv',
		package_dir={'SystemPlugins.ForceFbcLNBpower': 'src'},
		packages=['SystemPlugins.ForceFbcLNBpower'],
		package_data={'SystemPlugins.ForceFbcLNBpower': ['*.png']},
		description='Force Power LNB/ToneBurst for FBC DVB-S tuners(Lunix3-4K/Galaxy 4K/GigaBlue UE & Quad 4K)',
		cmdclass=setup_translate.cmdclass,
	)
